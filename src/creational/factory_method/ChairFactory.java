package creational.factory_method;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
