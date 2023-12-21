package structural.bridge;

// Concrete Abstraction: UberRide
class Uber implements NavigationSystem {
    private final String driverName;
    private NavigationImpl navigationImpl;

    public Uber(String driverName) {
        this.driverName = driverName;
    }

    public void setNavigationImpl(NavigationImpl impl) {
        this.navigationImpl = impl;
    }

    public void navigate(String destination) {
        System.out.print("Uber ride with " + driverName + " to " + destination + " using ");
        navigationImpl.navigateTo(destination);
    }
}