package modulo4_1_actividad15;

public class Actividad15 {

    public static void main(String[] args) {
        BillCalculator calculadora = new BillCalculator();

        double extra = calculadora.calculateExtraPerPerson(50, 5);
        double cuentaPersona = calculadora.calculateTotal(50) + extra;
        double totalGeneral = cuentaPersona * 5;

        System.out.println("Extra por persona: " + extra);
        System.out.println("Cada persona paga: " + cuentaPersona);
        System.out.println("Total general: " + totalGeneral);
    }
}

class BillCalculator {

    double tax = 0.21;
    double tip = 0.05;

    public double calculateTotal(double price) {
        return price * (1 + tax + tip);
    }

    public double calculateExtraPerPerson(double price, int peoplePaying) {
        return calculateTotal(price) / peoplePaying;
    }
}

