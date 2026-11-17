package modulo4_1_actividad15;

public class Actividad15 {
	  static double calculateTotal(double price) {

	        double tax = 0.21;
	        double tip = 0.05;

	        return price * (1 + tax + tip);

	    }

	    static double calculateExtraPerPerson(double total, int people) {

	        return total / people;

	    }

	    static double calculateIndividualPayment(double ownTotal, double extra) {

	        return ownTotal + extra;

	    }

	    public static void main(String[] args) {

	        double cuentaIndividual = calculateTotal(50);

	        double totalGeneral = cuentaIndividual * 6;

	        double extraPorPersona = calculateExtraPerPerson(cuentaIndividual, 5);

	        double pagoIndividual = calculateIndividualPayment(cuentaIndividual, extraPorPersona);

	        System.out.println("Extra por persona: " + extraPorPersona);
	        System.out.println("Cada persona paga: " + pagoIndividual);
	        System.out.println("Total general: " + totalGeneral);

	    }

	}