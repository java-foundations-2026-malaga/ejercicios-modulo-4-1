package modulo4_1_actividad14;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad14Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad14.main(new String[0]);} finally {System.setOut(old);} assertEquals("Ana: 25.2\nLuis: 37.8\nMarta: 50.4\nPablo: 63.0\nTotal: 176.4",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
