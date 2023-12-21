package structural.decorator;

class Pizza implements FoodItem {
    public String getDescription() {
        return "Pizza";
    }

    public double getPrice() {
        return 200.0;
    }
}

