package modulo4_1_actividad12;

public class Actividad12 {
    // TODO: implementa ComparatorTool.
    static public class ComparatorTool {
        public boolean isGreater(int a, int b) {
            return a > b;
        }
    }
    public static void main(String[] args) {
        ComparatorTool ins = new ComparatorTool();

        System.out.println("¿Es mayor?: " + ins.isGreater(10, 3));
    }
}
