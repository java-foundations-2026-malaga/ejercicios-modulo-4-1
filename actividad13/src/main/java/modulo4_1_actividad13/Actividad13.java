package modulo4_1_actividad13;

public class Actividad13 {
    // TODO: implementa BillCalculator.
    public static class BillCalculator {
        double tax = 0.21;
        double tip = 0.05;

        public double calculateTotal(double price) {
            return price * (1 + this.tax + this.tip);
        }
    }
    public static void main(String[] args) {
        BillCalculator ins = new BillCalculator();

        System.out.println("Cuenta 1: " + ins.calculateTotal(100));
        System.out.println("Cuenta 2: " + ins.calculateTotal(50));
        System.out.println("Cuenta 3: " + ins.calculateTotal(25));
    }
}
