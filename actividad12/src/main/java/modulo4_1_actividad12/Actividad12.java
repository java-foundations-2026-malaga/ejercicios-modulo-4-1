package modulo4_1_actividad12;

public class Actividad12 {

    public static void main(String[] args) {
        ComparatorTool mayor = new ComparatorTool();
        boolean resultado = mayor.isGreater(10, 3);

        System.out.println("¿Es mayor?: " + resultado);
    }
}

class ComparatorTool {

    public boolean isGreater(int a, int b) {
        return a > b;
    }
}