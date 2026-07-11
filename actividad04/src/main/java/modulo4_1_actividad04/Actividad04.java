package modulo4_1_actividad04;

public class Actividad04 {
  static class Calculator {
    void printTotal() {
      System.out.println("Total: " + (originalPrice * (1 + tax + tip)));
    }
  }

  public static void main(String[] args) {
    double tax = .21, tip = 0, originalPrice = 100;
    new Calculator().printTotal();
  }
}
