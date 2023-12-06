package creational.prototype;

public class Main {
    public static void main(String[] ar) {
        IProduct product = new Product("Macbook", 2000);
        IProduct newProduct = product.clone();
        product.display();
        newProduct.display();
    }
}
