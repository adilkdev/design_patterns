package creational.factory_method;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
