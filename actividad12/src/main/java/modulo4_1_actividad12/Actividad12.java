package modulo4_1_actividad12;

public class Actividad12 {
	  static class ComparatorTool {

	        boolean isGreater(int a, int b) {

	            return a > b;

	        }

	    }

	    public static void main(String[] args) {

	        ComparatorTool comparador = new ComparatorTool();

	        boolean resultado = comparador.isGreater(10, 3);

	        System.out.println("¿Es mayor?: " + resultado);

	    }

	}