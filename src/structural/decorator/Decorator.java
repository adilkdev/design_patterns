package structural.decorator;

abstract class Decorator implements FoodItem {
    protected FoodItem foodItem;

    public Decorator(FoodItem item) {
        this.foodItem = item;
    }
}
