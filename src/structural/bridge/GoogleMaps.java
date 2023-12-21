package structural.bridge;

// Concrete Implementation: GoogleMaps
class GoogleMaps implements NavigationImpl {
    public void navigateTo(String destination) {
        System.out.println("Google Maps.");
        // Actual navigation logic using Google Maps API
    }
}