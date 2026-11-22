package modulo4_1_actividad13;

public class Actividad13 {
    // TODO: implementa BillCalculator.
    // Crea la clase BillCalculator con campos `tax = 0.21` y `tip = 0.05` y el método `calculateTotal(double price)`, que devuelve `price * (1 + tax + tip)`. Calcula las cuentas de 100, 50 y 25.
    static class BillCalculator {
        private double tax = 0.21;
        private double tip = 0.05;

        double calculateTotal(double price) {
            return price * (1 + tax + tip);
        }
    }

    public static void main(String[] args) {
        BillCalculator calculator = new BillCalculator();
        System.out.println("Cuenta 1: " + calculator.calculateTotal(100));
        System.out.println("Cuenta 2: " + calculator.calculateTotal(50));
        System.out.println("Cuenta 3: " + calculator.calculateTotal(25));

    }
}
