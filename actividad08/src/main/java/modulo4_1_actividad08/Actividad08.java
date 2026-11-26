package modulo4_1_actividad08;

public class Actividad08 {
    // TODO: crea TipCalculator.
    static public class TipCalculator {
        double price = 100;
        double tax = 0.21;
        double tip = 0.05;

        public void printTotal() {
            System.out.println("Total: " + (this.price * (1 + this.tax + this.tip)));
        }
    }
    public static void main(String[] args) {

        TipCalculator ins = new TipCalculator();

        ins.printTotal();
    }
}
