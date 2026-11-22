package modulo4_1_actividad15;

public class Actividad15 {
    // TODO: crea métodos para total, extra y pago individual.
    // Seis personas consumen 50 cada una (impuesto 0.21 y propina 0.05). Un invitado no lleva cartera: reparte su cuenta entre las otras cinco personas. Crea al menos dos métodos que devuelvan double (por ejemplo, el total de una persona y el extra por persona) para no repetir la fórmula del total.
    // quiero esta salida:         comprobarSalida("Extra por persona: 12.6\nCada persona paga: 75.6\nTotal general: 378.0", salida);
    static class BillCalculator {
        private double tax = 0.21;
        private double tip = 0.05;

        double calculateTotal(double price) {
            return price * (1 + tax + tip);
        }

        double calculateExtra(double price) {
            return price * (tax + tip);
        }
    }

    public static void main(String[] args) {
        BillCalculator calculator = new BillCalculator();
        double total = 0;
        double extra = 0;

        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                // Invitado sin cartera
                total += calculator.calculateTotal(50);
                extra += calculator.calculateExtra(50);
            } else {
                total += calculator.calculateTotal(50);
                extra += calculator.calculateExtra(50);
            }
        }


        System.out.println("Extra por persona: " + extra / 5);
        System.out.println("Cada persona paga: " + (total / 5));
        System.out.println("Total general: " + total);
    }
}
