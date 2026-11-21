package modulo4_1_actividad11;

public class Actividad11 {
    // TODO: implementa Adder.
    // Crea la clase Adder con el método `sum(int a, int b)`, que devuelve la suma. Llámalo con 4 y 5 y muestra el valor retornado.
    static class Adder {
        int sum(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.sum(4, 5);
        System.out.println("Suma: " + result);
    }
}
