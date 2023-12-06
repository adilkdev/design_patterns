package creational.builder;

public class DellDesktopBuilder extends DesktopBuilder {

    DellDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    DesktopBuilder buildMotherboard() {
        desktop.motherboard = "Dell Motherboard";
        return this;
    }

    @Override
    DesktopBuilder buildProcessor() {
        desktop.processor = "Dell Processor";
        return this;
    }

    @Override
    DesktopBuilder buildMemory() {
        desktop.memory = "16GB RAM";
        return this;
    }

    @Override
    DesktopBuilder buildStorage() {
        desktop.storage = "1 TB";
        return this;
    }
}
