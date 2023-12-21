package structural.composite;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("Root");

        FileSystemComponent file1 = new File("Document.txt", 100);
        FileSystemComponent file2 = new File("Image.jpg", 200);

        Directory subDir = new Directory("Subdirectory");
        FileSystemComponent file3 = new File("Data.csv", 150);

        subDir.addComponent(file3);

        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDir);

        // List contents and calculate total size for the directory structure
        root.listContents();
        int totalSize = root.getSize();
        System.out.println("Total Size: " + totalSize + " KB");
    }

}

