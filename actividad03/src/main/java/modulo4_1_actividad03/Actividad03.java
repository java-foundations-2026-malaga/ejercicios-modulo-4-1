package modulo4_1_actividad03;

public class Actividad03 {
    void saludar() {
        System.out.println("Hola desde el objeto");
    }

    public static void main(String[] args) {
        Actividad03 objeto = new Actividad03();
        objeto saludar();
    }
}
