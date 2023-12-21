package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Concrete Implementation: Directory
class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> contents;

    public Directory(String dirName) {
        this.name = dirName;
        this.contents = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        contents.add(component);
    }

    @Override
    public void listContents() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : contents) {
            component.listContents();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : contents) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
