package modulo4_1_actividad08;

public class Actividad08 {
    // TODO: crea TipCalculator.
    // Crea la clase TipCalculator con campos `price = 100`, `tax = 0.21` y `tip = 0.05` y un método `printTotal()` sin argumentos que muestre `price * (1 + tax + tip)`.
    static class TipCalculator {
        double price = 100;
        double tax = 0.21;
        double tip = 0.05;

        void printTotal() {
            System.out.println("Total: " + (price * (1 + tax + tip)));
        }
    }

    public static void main(String[] args) {
        TipCalculator calculator = new TipCalculator();
        calculator.printTotal();

    }
}
