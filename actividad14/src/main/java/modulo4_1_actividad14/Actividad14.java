package modulo4_1_actividad14;

public class Actividad14 {
    // TODO: calcula las cuatro cuentas.
    // Usa un método `calculateTotal(double price)` (impuesto 0.21 y propina 0.05) para calcular lo que paga cada persona: Ana consume 20, Luis 30, Marta 40 y Pablo 50. Muestra también el total general.
    static class BillCalculator {
        private double tax = 0.21;
        private double tip = 0.05;

        double calculateTotal(double price) {
            return price * (1 + tax + tip);
        }
    }

    public static void main(String[] args) {
        BillCalculator calculator = new BillCalculator();
        double total = 0;

        total += calculator.calculateTotal(20);
        System.out.println("Ana: " + calculator.calculateTotal(20));

        total += calculator.calculateTotal(30);
        System.out.println("Luis: " + calculator.calculateTotal(30));

        total += calculator.calculateTotal(40);
        System.out.println("Marta: " + calculator.calculateTotal(40));

        total += calculator.calculateTotal(50);
        System.out.println("Pablo: " + calculator.calculateTotal(50));

        System.out.println("Total: " + total);
    }
}
