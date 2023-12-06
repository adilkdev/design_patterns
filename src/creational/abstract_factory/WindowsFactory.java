package creational.abstract_factory;

public class WindowsFactory implements IFactory {

    @Override
    public Keyboard createKeyboard() {
        return new WindowsKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new WindowsMouse();
    }
}
