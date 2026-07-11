package modulo4_1_actividad13;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad13Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad13.main(new String[0]);} finally {System.setOut(old);} assertEquals("Cuenta 1: 126.0\nCuenta 2: 63.0\nCuenta 3: 31.5",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
