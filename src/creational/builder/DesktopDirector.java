package creational.builder;

public class DesktopDirector {
    Desktop buildDesktop(DesktopBuilder builder) {
        return builder
                .buildMotherboard()
                .buildProcessor()
                .buildMemory()
                .buildStorage()
                .build();
    }
}
