package creational.prototype;

public class Product implements IProduct {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
    }

    @Override
    public IProduct clone() {
        return new Product(name, price);
    }
}
