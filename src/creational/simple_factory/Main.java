package creational.simple_factory;

public class Main {
    public static void main(String[] ar) {
        Keyboard keyboard = KeyboardFactory.createKeyboard(MachineType.ANDROID);
        keyboard.displayInfo();
        keyboard = KeyboardFactory.createKeyboard(MachineType.MAC);
        keyboard.displayInfo();
        keyboard = KeyboardFactory.createKeyboard(MachineType.WINDOWS);
        keyboard.displayInfo();
    }
}
