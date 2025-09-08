public class CarTester {
    public static void main(String[] args) {
        // Car with full details
        Car c1 = new Car("Yellow", "KAM12345", "AB123", "Toyota", "Vios");

        // Car with default values
        Car c2 = new Car();

        // Display car info
        c1.displayInfo();
        c2.displayInfo();
    }
}
