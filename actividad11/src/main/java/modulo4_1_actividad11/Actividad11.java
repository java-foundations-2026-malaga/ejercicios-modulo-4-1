package modulo4_1_actividad11;

public class Actividad11 {
    // TODO: implementa Adder.
    static public class Adder {
        public int sum (int a, int b) {
            return (a + b);
        }
    }
    public static void main(String[] args) {
        Adder ins = new Adder();

        System.out.println("Suma: " + ins.sum(4, 5));
    }
}
