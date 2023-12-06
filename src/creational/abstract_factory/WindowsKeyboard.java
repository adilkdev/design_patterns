package creational.abstract_factory;

public class WindowsKeyboard implements Keyboard {
    @Override
    public void displayInfo() {
        System.out.println("Input type is windows keyboard");
    }
}
