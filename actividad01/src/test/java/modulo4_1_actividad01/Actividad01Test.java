package modulo4_1_actividad01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class Actividad01Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        String salida = ejecutarMain();
        comprobarSalida("Programa iniciado", salida);
    }

    private static String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Method main;
            try {
                main = Actividad01.class.getMethod("main", String[].class);
            } catch (NoSuchMethodException e) {
                fail("No existe el metodo public static void main(String[] args).");
                return "";
            }
            assertTrue(Modifier.isStatic(main.getModifiers()), "main debe ser static.");
            main.invoke(null, (Object) new String[0]);
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
}
