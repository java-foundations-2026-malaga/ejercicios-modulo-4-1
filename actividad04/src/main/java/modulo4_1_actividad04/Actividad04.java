package modulo4_1_actividad04;

public class Actividad04 {

    static class Calculator {

        double tax = 0.21;
        double tip = 0;
        double originalPrice = 100;

        void printTotal() {

            System.out.println("Total: " + (originalPrice * (1 + tax + tip)));

        }

    }

    public static void main(String[] args) {

        new Calculator().printTotal();

    }

}