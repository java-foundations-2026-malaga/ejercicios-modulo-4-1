package modulo4_1_actividad13;

public class BillCalculator {
	public double tax = 0.21;
	public double tip = 0.05;
	public double calculateTotal(double price) {
		double calculo = price * (1 + tax + tip);
		return calculo;
	}
}
