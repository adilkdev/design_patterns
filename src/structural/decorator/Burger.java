package structural.decorator;

class Burger implements FoodItem {
    public String getDescription() {
        return "Burger";
    }

    public double getPrice() {
        return 100.0;
    }
}
