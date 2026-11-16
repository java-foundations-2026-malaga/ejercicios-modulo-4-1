package modulo4_1_actividad14;


public class Actividad14 {
    // TODO: calcula las cuatro cuentas.
	public static double calculateTotal(double price) {
		double tax = 0.21;
		double tip = 0.05;
		return price*(1 + tax + tip);
		
	}
    public static void main(String[] args) {
    	//calculateTotal calculo = new calculateTotal();
    	
    	System.out.println("Ana: " + calculateTotal(20));
    	System.out.println("Luis: " + calculateTotal(30));
    	System.out.println("Marta: " + calculateTotal(40));
    	System.out.println("Pablo: " + calculateTotal(50));
    	double a = calculateTotal(20) + calculateTotal(30) + calculateTotal(40) + calculateTotal(50);
    	System.out.println("Total: " + a);
    }
}
