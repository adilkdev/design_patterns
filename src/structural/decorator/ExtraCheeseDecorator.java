package structural.decorator;

class ExtraCheeseDecorator extends Decorator {
    private final double extraCheesePrice;

    public ExtraCheeseDecorator(FoodItem item, double price) {
        super(item);
        this.extraCheesePrice = price;
    }

    public String getDescription() {
        return foodItem.getDescription() + " with Extra Cheese";
    }

    public double getPrice() {
        return foodItem.getPrice() + extraCheesePrice;
    }
}