package modulo4_1_actividad13;

public class Actividad13 {
    // TODO: implementa BillCalculator.
    public static void main(String[] args) {
    	BillCalculator comparador = new BillCalculator();
    	double cal100 = comparador.calculateTotal(100);
    	double cal50 =comparador.calculateTotal(50);
    	double cal25 =comparador.calculateTotal(25);
    	System.out.println("Cuenta 1: "+cal100+"\nCuenta 2: "+cal50+"\nCuenta 3: "+cal25);
    	
    }
}
