package modulo4_1_actividad10;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad10Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad10.main(new String[0]);} finally {System.setOut(old);} assertEquals("División: 2.5",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
