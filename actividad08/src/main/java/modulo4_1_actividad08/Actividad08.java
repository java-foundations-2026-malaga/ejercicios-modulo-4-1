package modulo4_1_actividad08;

public class Actividad08 {

    static class TipCalculator {

        double price = 100;
        double tax = 0.21;
        double tip = 0.05;

        void printTotal() {

            double total = price * (1 + tax + tip);

            System.out.println("Total: " + total);

        }

    }

    public static void main(String[] args) {

        TipCalculator calculadora = new TipCalculator();

        calculadora.printTotal();

    }

} 