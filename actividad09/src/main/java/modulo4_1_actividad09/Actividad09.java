package modulo4_1_actividad09;

public class Actividad09 {
	static class Doubler {

        void printDouble(int number) {

            System.out.println("Doble: " + (number * 2));

        }

    }

    public static void main(String[] args) {

        Doubler duplicador = new Doubler();

        duplicador.printDouble(7);

    }

} 