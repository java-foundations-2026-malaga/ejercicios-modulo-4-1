package modulo4_1_actividad10;

public class Actividad10 {
    // TODO: implementa Divider.
    // Crea la clase Divider con el método `printDivision(int x, double y)`, que muestra `x / y`. Llámalo desde `main` con 5 y 2.0.
    static class Divider {
        void printDivision(int x, double y) {
            System.out.println("División: " + (x / y));
        }
    }

    public static void main(String[] args) {
        Divider divider = new Divider();
        divider.printDivision(5, 2.0);
    }
}
