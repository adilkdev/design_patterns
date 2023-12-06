package creational.builder;

public class Main {
    public static void main(String[] ar) {
        DesktopDirector director = new DesktopDirector();
        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop dellDesktop = director.buildDesktop(dellDesktopBuilder);

        HPDesktopBuilder hpDesktopBuilder = new HPDesktopBuilder();
        Desktop hpDesktop = director.buildDesktop(hpDesktopBuilder);

        dellDesktop.display();
        hpDesktop.display();
    }
}
