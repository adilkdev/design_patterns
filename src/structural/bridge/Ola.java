package structural.bridge;

// Concrete Abstraction: UberEats
class Ola implements NavigationSystem {
    private final String driverName;
    private NavigationImpl navigationImpl;

    public Ola(String driverName) {
        this.driverName = driverName;
    }

    public void setNavigationImpl(NavigationImpl impl) {
        this.navigationImpl = impl;
    }

    public void navigate(String destination) {
        System.out.print("Ola ride with " + driverName + " to " + destination + " using ");
        navigationImpl.navigateTo(destination);
    }
}