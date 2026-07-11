package modulo4_1_actividad15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad15Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream old = System.out;
    System.setOut(new PrintStream(b, true, StandardCharsets.UTF_8));
    try {
      Actividad15.main(new String[0]);
    } finally {
      System.setOut(old);
    }
    assertEquals(
        "Extra por persona: 12.6\nCada persona paga: 75.6\nTotal general: 378.0",
        b.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim());
  }
}
