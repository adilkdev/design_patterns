package creational.builder;

abstract class DesktopBuilder {
    protected Desktop desktop;

    abstract DesktopBuilder buildMotherboard();

    abstract DesktopBuilder buildProcessor();

    abstract DesktopBuilder buildMemory();

    abstract DesktopBuilder buildStorage();

    Desktop build() {
        return desktop;
    }
}
