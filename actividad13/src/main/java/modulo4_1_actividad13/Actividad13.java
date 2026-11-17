package modulo4_1_actividad13;

public class Actividad13 {
	static class BillCalculator {

        double tax = 0.21;
        double tip = 0.05;

        double calculateTotal(double price) {

            return price * (1 + tax + tip);

        }

    }

    public static void main(String[] args) {

        BillCalculator calculadora = new BillCalculator();

        double cuenta1 = calculadora.calculateTotal(100);
        double cuenta2 = calculadora.calculateTotal(50);
        double cuenta3 = calculadora.calculateTotal(25);

        System.out.println("Cuenta 1: " + cuenta1);
        System.out.println("Cuenta 2: " + cuenta2);
        System.out.println("Cuenta 3: " + cuenta3);

    }

}