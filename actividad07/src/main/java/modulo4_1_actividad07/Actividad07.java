package modulo4_1_actividad07;

public class Actividad07 {
    static class Product {

        public String name;
        public double price;

        public void printProduct() {
            System.out.println("Producto: " + name);
            System.out.println("Precio: " + price);
        }

    }

    public static void main(String[] args) {

        Product producto = new Product();

        producto.name = "Teclado";
        producto.price = 29.99;

        producto.printProduct();

    }

}