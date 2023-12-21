package structural.decorator;

public class Main {

    public static void main(String[] ar) {
        FoodItem pizza = new Pizza();
        FoodItem burger = new Burger();

        pizza = new ExtraCheeseDecorator(pizza, 10.0);
        burger = new ExtraCheeseDecorator(burger, 20.0);

        System.out.println("Description of pizza order is " + pizza.getDescription());
        System.out.println("Price of pizza order is: " + pizza.getPrice());

        System.out.println("Description of burger order is " + burger.getDescription());
        System.out.println("Price of burger order is: " + burger.getPrice());
    }

}
