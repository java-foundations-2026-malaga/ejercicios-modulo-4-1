package modulo4_1_actividad07;

public class Actividad07 {
    // TODO: crea Product y muestra sus datos.
    // Crea la clase Product con campos públicos `name` (String) y `price` (double) y un método `printProduct()`. Desde `main`, crea un producto Teclado de 29.99 y muéstralo.
    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void printProduct() {
            System.out.println("Producto: " + this.name + "Precio: " + this.price);
        }
    }

    public static void main(String[] args) {
        Product product = new Product("Teclado\n", 29.99);

        product.printProduct();
    }
}