package modulo4_1_actividad10;

public class Actividad10 {
    // TODO: implementa Divider.
    public static class Divider {

        public void printDivision(int x, double y) {
            System.out.println("División: " + x / y);
        }
    }
    public static void main(String[] args) {
        Divider ins = new Divider();

        ins.printDivision(5, 2.0);
    }
}
