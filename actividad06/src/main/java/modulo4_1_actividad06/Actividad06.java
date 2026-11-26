package modulo4_1_actividad06;

public class Actividad06 {
    // TODO: crea la clase Greeter y usala desde main.
     public static class Greeter {
        public void sayHello() {
            System.out.println("Hello from method");
        }
    }

    public static void main(String[] args) {
        Greeter ins = new Greeter();
        ins.sayHello();
    }
}
