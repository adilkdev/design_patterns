package structural.composite;

// Concrete Implementation: File
class File implements FileSystemComponent {
    private final String name;
    private final int size;

    public File(String fileName, int fileSize) {
        this.name = fileName;
        this.size = fileSize;
    }

    @Override
    public void listContents() {
        System.out.println("File: " + name);
    }

    @Override
    public int getSize() {
        return size;
    }
}

