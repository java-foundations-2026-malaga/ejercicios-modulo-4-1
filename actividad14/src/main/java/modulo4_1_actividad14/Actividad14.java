package modulo4_1_actividad14;


public class Actividad14 {
    // TODO: calcula las cuatro cuentas.
    public static void main(String[] args) {
    	double ana = 20;
    	double luis = 30;
    	double marta = 40;
    	double pablo = 50;
    	double anaTotal= calculateTotal(ana);
    	double luisTotal = calculateTotal(luis);
    	double martaTotal = calculateTotal(marta);
    	double pabloTotal = calculateTotal(pablo);  	
    	System.out.println("Ana: "+anaTotal+"\nLuis: "+luisTotal+"\nMarta: "+martaTotal+"\nPablo: "+pabloTotal+"\nTotal: "+(anaTotal+luisTotal+martaTotal+pabloTotal));
    }
    public static double calculateTotal(double price){
    	double impuesto = 0.21;
    	double propina = 0.05;
    	price = price+(price*impuesto+(price*propina));
    	return price;
    }
}
