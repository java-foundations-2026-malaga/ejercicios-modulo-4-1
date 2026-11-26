package modulo4_1_actividad15;

public class Actividad15 {
    // TODO: crea métodos para total, extra y pago individual.
    public static double totalPerPerson (double price) {
        return price * (1.0 + 0.21 + 0.05);
    }

    public static double extraPerPerson (double price) {
        return totalPerPerson(price) / 5.0;
    }
    public static void main(String[] args) {
        System.out.println("Extra por persona: " + extraPerPerson(50));
        System.out.println("Cada persona paga: " + (totalPerPerson(50) + extraPerPerson(50)));
        System.out.println("Total general: " + (totalPerPerson(50) * 5 + extraPerPerson(50) * 5));
    }
}
