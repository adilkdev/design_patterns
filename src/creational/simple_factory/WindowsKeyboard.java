package creational.simple_factory;

public class WindowsKeyboard implements Keyboard {
    @Override
    public void displayInfo() {
        System.out.println("Input type Windows Keyboard");
    }
}
