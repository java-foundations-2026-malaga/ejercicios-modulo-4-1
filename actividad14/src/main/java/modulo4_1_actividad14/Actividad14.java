package modulo4_1_actividad14;

public class Actividad14 {
    // TODO: calcula las cuatro cuentas.
    public static class BillCalculator {
        double tax = 0.21;
        double tip = 0.05;

        public double calculateTotal(double price) {
            return price * (1 + this.tax + this.tip);
        }
    }
    public static void main(String[] args) {
        BillCalculator ins = new BillCalculator();

        System.out.println("Ana: " + ins.calculateTotal(20));
        System.out.println("Luis: " + ins.calculateTotal(30));
        System.out.println("Marta: " + ins.calculateTotal(40));
        System.out.println("Pablo: " + ins.calculateTotal(50));
        System.out.println("Total: " + ( ins.calculateTotal(20) + ins.calculateTotal(30) + ins.calculateTotal(40) + ins.calculateTotal(50)));
    }
}
