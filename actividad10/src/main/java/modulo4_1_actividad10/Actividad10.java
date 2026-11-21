package modulo4_1_actividad10;

public class Actividad10 {

    public static void main(String[] args) {
        Divider divisor = new Divider();
        divisor.printDivision(5, 2.0);
    }
}

class Divider {

    public void printDivision(int x, double y) {
        System.out.println("División: " + (x / y));
    }
}