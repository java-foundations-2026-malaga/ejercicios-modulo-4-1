package modulo4_1_actividad09;

public class Actividad09 {
    // TODO: implementa Doubler.
    // Crea la clase Doubler con el método `printDouble(int number)`, que muestra el doble del número. Llámalo desde `main` con el valor 7.
    static class Doubler {
        void printDouble(int number) {
            System.out.println("Doble: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        Doubler doubler = new Doubler();
        doubler.printDouble(7);
    }
}
