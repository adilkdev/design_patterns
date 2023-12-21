package structural.bridge;

public class Main {

    public static void main(String[] args) {
        // Create an UberRide with a driver
        Uber uber = new Uber("John");

        // Create an Ola ride with a driver
        Ola ola = new Ola("Sam");

        // Create different navigation implementations
        GoogleMaps googleMaps = new GoogleMaps();
        AppleMaps appleMaps = new AppleMaps();

        // Set the navigation implementation for Uber
        uber.setNavigationImpl(googleMaps);

        // Request an Uber ride with Google Maps navigation
        uber.navigate("Central Perk");

        // Switch to Apple Maps navigation for Ola
        ola.setNavigationImpl(appleMaps);

        // Request an Ola ride with Apple Maps navigation
        ola.navigate("Farzi Cafe");
    }

}
