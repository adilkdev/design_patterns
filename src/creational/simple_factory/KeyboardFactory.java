package creational.simple_factory;

public class KeyboardFactory {
    public static Keyboard createKeyboard(MachineType type) {
        return switch (type) {
            case WINDOWS -> new WindowsKeyboard();
            case MAC -> new MacKeyboard();
            case ANDROID -> new AndroidKeyboard();
        };
    }
}
