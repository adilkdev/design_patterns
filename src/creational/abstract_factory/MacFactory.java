package creational.abstract_factory;

public class MacFactory implements IFactory {
    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }
}
