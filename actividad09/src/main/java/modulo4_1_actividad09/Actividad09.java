package modulo4_1_actividad09;

public class Actividad09 {
    // TODO: implementa Doubler.
    public static class Doubler {
        public void printDouble(int num) {
            System.out.println("Doble: " + num * 2);
        }
    }
    public static void main(String[] args) {
        Doubler ins = new Doubler();

        ins.printDouble(7);

    }
}
