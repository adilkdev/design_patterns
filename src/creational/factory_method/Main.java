package creational.factory_method;

public class Main {
    public static void main(String[] ar) {
        FurnitureFactory furnitureFactory = new SofaFactory();
        Furniture furniture = furnitureFactory.createFurniture();
        furniture.display();

        furnitureFactory = new TableFactory();
        furniture = furnitureFactory.createFurniture();
        furniture.display();

        furnitureFactory = new ChairFactory();
        furniture = furnitureFactory.createFurniture();
        furniture.display();
    }
}
