package modulo4_1_actividad12;

public class Actividad12 {
    // TODO: implementa ComparatorTool.
    // Crea la clase ComparatorTool con el método `isGreater(int a, int b)`, que devuelve si `a` es mayor que `b`. Llámalo con 10 y 3.
    static class ComparatorTool {
        boolean isGreater(int a, int b) {
            return a > b;
        }
    }

    public static void main(String[] args) {
        ComparatorTool comparator = new ComparatorTool();
        boolean result = comparator.isGreater(10, 3);
        System.out.println("¿Es mayor?: " + result);
    }
}
