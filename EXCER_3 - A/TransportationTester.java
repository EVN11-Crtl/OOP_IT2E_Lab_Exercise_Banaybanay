public class TransportationTester {
    public static void main(String[] args) {
        Transportation[] transports = {
            new Plane("Boeing", "747", 2018, 900, 4.0, "Jet Fuel", 68.5, 400),
            new Helicopter("Airbus", "H125", 2020, 260, 1.0, "Aviation Fuel", 11.0, 4),
            new Truck("Volvo", "FH16", 2021, 120, 16.0, "Diesel", 6, 40),
            new SUV("Toyota", "Fortuner", 2019, 180, 2.8, "Diesel", 4, 7),
            new Tricycle("Bajaj", "RE", 2022, 60, 0.2, "Gasoline", 3, "Passenger", true),
            new Motorcycle("Yamaha", "R1", 2021, 299, 1.0, "Gasoline", 2, "Sport"),
            new Kariton("Local", "Wooden", 2010, 10, 0.0, "None", 4, "Wood", false),
            new Boat("Bayliner", "Element", 2018, 70, 1.2, "Gasoline", "Planing", 6),
            new Ship("Maersk", "Triple-E", 2015, 50, 80.0, "Diesel", "Displacement", 200000)
        };

        for (Transportation t : transports) {
            t.showInfo();
            t.move();
            System.out.println();
        }
    }
}
