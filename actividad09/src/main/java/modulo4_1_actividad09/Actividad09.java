package modulo4_1_actividad09;

class Doubler {
    void printDouble(int number) {
        System.out.println("Doble: " + (number * 2));
    }
}

public class Actividad09 {
    public static void main(String[] args) {
        Doubler doblador = new Doubler();
        doblador.printDouble(7);
    }
}

