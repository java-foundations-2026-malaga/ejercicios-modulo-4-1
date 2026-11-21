package modulo4_1_actividad11;

public class Actividad11 {

    public static void main(String[] args) {
        Adder suma = new Adder();
        int resultado = suma.sum(4, 5);

        System.out.println("Suma: " + resultado);
    }
}

class Adder {

    public int sum(int a, int b) {
        return a + b;
    }
}