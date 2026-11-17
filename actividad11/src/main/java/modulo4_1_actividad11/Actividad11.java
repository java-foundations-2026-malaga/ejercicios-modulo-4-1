package modulo4_1_actividad11;

public class Actividad11 {

    static class Adder {

        int sum(int a, int b) {

            return a + b;

        }

    }

    public static void main(String[] args) {

        Adder sumador = new Adder();

        int resultado = sumador.sum(4, 5);

        System.out.println("Suma: " + resultado);

    }

} 