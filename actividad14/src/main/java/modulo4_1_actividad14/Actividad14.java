package modulo4_1_actividad14;

public class Actividad14 {

    public static void main(String[] args) {
        BillCalculator calculadora = new BillCalculator();

        double ana = calculadora.calculateTotal(20);
        double luis = calculadora.calculateTotal(30);
        double marta = calculadora.calculateTotal(40);
        double pablo = calculadora.calculateTotal(50);

        System.out.println("Ana: " + ana);
        System.out.println("Luis: " + luis);
        System.out.println("Marta: " + marta);
        System.out.println("Pablo: " + pablo);

        double total = ana + luis + marta + pablo;
        System.out.println("Total: " + total);
    }
}

class BillCalculator {

    double tax = 0.21;
    double tip = 0.05;

    public double calculateTotal(double price) {
        return price * (1 + tax + tip);
    }
}