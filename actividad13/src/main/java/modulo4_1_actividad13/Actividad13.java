package modulo4_1_actividad13;

public class Actividad13 {

    public static void main(String[] args) {
        BillCalculator calculadora = new BillCalculator();

        System.out.println("Cuenta 1: " + calculadora.calculateTotal(100));
        System.out.println("Cuenta 2: " + calculadora.calculateTotal(50));
        System.out.println("Cuenta 3: " + calculadora.calculateTotal(25));
    }
}

class BillCalculator {

    double tax = 0.21;
    double tip = 0.05;

    public double calculateTotal(double price) {
        return price * (1 + tax + tip);
    }
}
