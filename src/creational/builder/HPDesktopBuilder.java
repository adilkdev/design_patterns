package creational.builder;

public class HPDesktopBuilder extends DesktopBuilder {
    HPDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    DesktopBuilder buildMotherboard() {
        desktop.motherboard = "HP Motherboard";
        return this;
    }
    @Override
    DesktopBuilder buildProcessor() {
        desktop.processor = "HP Processor";
        return this;
    }
    @Override
    DesktopBuilder buildMemory() {
        desktop.memory = "24GB RAM";
        return this;
    }
    @Override
    DesktopBuilder buildStorage() {
        desktop.storage = "1 TB";
        return this;
    }
}
