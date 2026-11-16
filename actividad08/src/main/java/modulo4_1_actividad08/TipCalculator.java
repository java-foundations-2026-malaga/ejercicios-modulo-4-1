package modulo4_1_actividad08;

public class TipCalculator {
	public double price = 100;
	public double tax = 0.21;
	public double tip = 0.05;
	
	public void printTotal() {
		System.out.println("Total: " + price*(1 + tax + tip));
	}

}
