package modulo4_1_actividad07;

public class Actividad07 {
    // TODO: crea Product y muestra sus datos.
    static public class Product {
        String name;
        double price;


        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void printProduct() {
            System.out.println("Producto: " + this.name);
            System.out.println("Precio: " + this.price);
        }
    }
    public static void main(String[] args) {
        Product ins = new Product("Teclado", 29.99);

        ins.printProduct();
    }
}
