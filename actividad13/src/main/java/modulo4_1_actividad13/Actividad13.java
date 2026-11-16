package modulo4_1_actividad13;

public class Actividad13 {
    // TODO: implementa BillCalculator.
    public static void main(String[] args) {
    	BillCalculator cuenta = new BillCalculator();
    	
    	System.out.println("Cuenta 1: " + cuenta.calculateTotal(100));
    	System.out.println("Cuenta 2: " + cuenta.calculateTotal(50));
    	System.out.println("Cuenta 3: " + cuenta.calculateTotal(25));
    }
}
