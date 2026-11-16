package modulo4_1_actividad15;

public class Actividad15 {
    // TODO: crea métodos para total, extra y pago individual.
	public static double totalporpersona(double precio, double tax, double tip) {
		return precio*(1 + tax + tip);
	}
	public static double extraporpersona(double total, int personas) {
		return total/personas;
	}
    public static void main(String[] args) {
    	int numper = 5;
    	double precio = 50;
    	double tax = 0.21;
    	double tip = 0.05;
    	
    	double total1 = totalporpersona(precio, tax, tip);
    	double extra = extraporpersona(total1, numper);
    	
    	System.out.println("Extra por persona: " + extra);
    	double textra = total1 + extra;
    	System.out.println("Cada persona paga: " + (textra));
    	double totalgeneral = textra*numper;
    	System.out.println("Total general: " + totalgeneral);
    	
    	
    }
}
