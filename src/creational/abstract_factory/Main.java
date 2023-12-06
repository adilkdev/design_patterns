package creational.abstract_factory;

public class Main {
    public static void main(String[] ar) {
        IFactory factory = new MacFactory();
        Keyboard keyboard = factory.createKeyboard();
        Mouse mouse = factory.createMouse();
        keyboard.displayInfo();
        mouse.displayInfo();

        System.out.println();

        factory = new WindowsFactory();
        keyboard = factory.createKeyboard();
        mouse = factory.createMouse();
        keyboard.displayInfo();
        mouse.displayInfo();
    }
}
