package creational.factory_method;

public class SofaFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }
}
