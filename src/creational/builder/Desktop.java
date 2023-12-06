package creational.builder;

public class Desktop {
    String motherboard;
    String processor;
    String memory;
    String storage;

    void display() {
        System.out.println("Desktop Specs:");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
    }
}
