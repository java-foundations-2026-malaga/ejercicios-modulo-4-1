package modulo4_1_actividad15;

public class Actividad15 {
    // TODO: crea métodos para total, extra y pago individual.
    public static void main(String[] args) {
    	/*Seis personas consumen 50 cada una (impuesto 0.21 y propina 0.05). 
    	 * Un invitado no lleva cartera: reparte su cuenta entre las otras cinco personas. 
    	 * Crea al menos dos métodos que devuelvan double (por ejemplo, el total de una persona 
    	 * y el extra por persona) para no repetir la fórmula del total.
    	 */
    	double total = getTotal();
    	double extraPersona = getExtraPersona(total);
    	double totalExtra = total + extraPersona;
    	double totalGeneral = total*6;
    	System.out.println("Extra por persona: "+extraPersona+"\nCada persona paga: "+totalExtra+"\nTotal general: "+totalGeneral);
    }
    public static double getExtraPersona(double total) {
    	double extraPersonaG = total/5;
    	return extraPersonaG;
    }
    public static double getTotal() {
    	double totalG = 50+(50*0.21)+(50*0.05);
    	return totalG;
    }
}
