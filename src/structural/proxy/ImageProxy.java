package structural.proxy;

class ImageProxy implements Image {
    private RealImage realImage;
    private final String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
        this.realImage = null;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Initialising the image");
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}