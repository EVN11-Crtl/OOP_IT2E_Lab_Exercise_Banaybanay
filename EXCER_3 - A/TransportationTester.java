public class TransportationTester {
    public static void main(String[] args) {
        // Air Transport
        Plane plane = new Plane("Boeing 747", 416);
        Helicopter helicopter = new Helicopter("Apache Helicopter", 6);

        // Land Transport
        Truck truck = new Truck("Truck", 2);
        SUV suv = new SUV("Toyota Fortuner", 7);
        Tricycle tricycle = new Tricycle("Tricycle", 3);
        Motorcycle motorcycle = new Motorcycle("Yamaha R1", 2);
        Kariton kariton = new Kariton("Kariton", 1);

        // Water Transport
        Boat boat = new Boat("Fishing Boat", 8);
        Ship ship = new Ship("War Ship", 3000);

        // Array of all transports
        Transportation[] transports = {
            plane, helicopter, truck, suv, tricycle, motorcycle, kariton, boat, ship
        };

        // Loop through all transports
        for (Transportation t : transports) {
            t.showInfo();
            t.move();
            System.out.println(); 
        }
    }
}
