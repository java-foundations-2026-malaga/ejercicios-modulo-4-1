package modulo4_1_actividad14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Actividad14Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        String salida = ejecutarMain();
        comprobarSalida("Ana: 25.2\nLuis: 37.8\nMarta: 50.4\nPablo: 63.0\nTotal: 176.4", salida);
    }

    @Test
    void compruebaCodigoFuente() throws Exception {
        String codigo = leerCodigoFuente();
        assertTrue(contiene(codigo, "double\\s+calculateTotal\\s*\\(\\s*double\\s+\\w+\\s*\\)"),
                "Crea un metodo double calculateTotal(double price) y reutilizalo para cada persona.");
        assertFalse(codigo.contains("Ana: 25.2"),
                "No escribas el resultado directamente: calculalo en el programa.");
        assertFalse(codigo.contains("Luis: 37.8"),
                "No escribas el resultado directamente: calculalo en el programa.");
        assertFalse(codigo.contains("Marta: 50.4"),
                "No escribas el resultado directamente: calculalo en el programa.");
        assertFalse(codigo.contains("Pablo: 63.0"),
                "No escribas el resultado directamente: calculalo en el programa.");
        assertFalse(codigo.contains("Total: 176.4"),
                "No escribas el resultado directamente: calculalo en el programa.");
    }

    private static String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad14.main(new String[0]);
        } finally {
            System.setOut(originalOut);
            Locale.setDefault(originalLocale);
        }
        return buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n");
    }

    private static void comprobarSalida(String esperada, String salida) {
        String[] esperadas = esperada.split("\n");
        String[] reales = lineasNoVacias(salida);
        assertEquals(esperadas.length, reales.length,
                "Numero de lineas incorrecto. Salida obtenida:\n" + salida);
        for (int i = 0; i < esperadas.length; i++) {
            assertTrue(lineasEquivalentes(esperadas[i], reales[i]),
                    "Linea " + (i + 1) + ": se esperaba <" + esperadas[i] + "> pero se obtuvo <" + reales[i] + ">");
        }
    }

    private static String[] lineasNoVacias(String texto) {
        return texto.replace("\r\n", "\n").lines()
                .map(String::strip)
                .filter(linea -> !linea.isEmpty())
                .toArray(String[]::new);
    }

    private static boolean lineasEquivalentes(String esperada, String real) {
        real = real.strip();
        if (esperada.equals(real)) {
            return true;
        }
        int separador = esperada.lastIndexOf(": ");
        if (separador < 0 || !real.startsWith(esperada.substring(0, separador + 1))) {
            return false;
        }
        String valorEsperado = esperada.substring(separador + 2);
        String valorReal = real.substring(separador + 1).strip();
        if (!valorEsperado.contains(".")) {
            return valorEsperado.equals(valorReal);
        }
        try {
            double a = Double.parseDouble(valorEsperado);
            double b = Double.parseDouble(valorReal);
            return Math.abs(a - b) < 1e-6;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String leerCodigoFuente() throws Exception {
        StringBuilder codigo = new StringBuilder();
        try (Stream<Path> rutas = Files.walk(Path.of("src/main/java"))) {
            for (Path ruta : rutas.filter(r -> r.toString().endsWith(".java")).toList()) {
                codigo.append(Files.readString(ruta, StandardCharsets.UTF_8)).append('\n');
            }
        }
        return codigo.toString()
                .replaceAll("(?s)/\\*.*?\\*/", "")
                .replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }
}
