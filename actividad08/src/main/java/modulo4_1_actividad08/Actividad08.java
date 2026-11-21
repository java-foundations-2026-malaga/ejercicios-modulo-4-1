package modulo4_1_actividad08;

class TipCalculator {
    double price = 100;
    double tax = 0.21;
    double tip = 0.05;

    void printTotal() {
        System.out.println("Total: " + (price * (1 + tax + tip)));
    }
}

public class Actividad08 {
    public static void main(String[] args) {
        TipCalculator calculadora = new TipCalculator();
        calculadora.printTotal();
    }
}