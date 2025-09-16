public abstract class AirTransport extends Transportation {
    protected double wingspan;

    public AirTransport(String brand, String model, int year, double maxSpeed,
                        double engineCapacity, String fuelType, double wingspan) {
        super(brand, model, year, maxSpeed, engineCapacity, fuelType);
        this.wingspan = wingspan;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

// Subclasses
class Plane extends AirTransport {
    private int passengerCapacity;

    public Plane(String brand, String model, int year, double maxSpeed,
                 double engineCapacity, String fuelType, double wingspan, int passengerCapacity) {
        super(brand, model, year, maxSpeed, engineCapacity, fuelType, wingspan);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println(brand + " " + model + " is flying in the sky.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== PLANE INFO ===");
        super.showInfo();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}

class Helicopter extends AirTransport {
    private int rotorBlades;

    public Helicopter(String brand, String model, int year, double maxSpeed,
                      double engineCapacity, String fuelType, double wingspan, int rotorBlades) {
        super(brand, model, year, maxSpeed, engineCapacity, fuelType, wingspan);
        this.rotorBlades = rotorBlades;
    }

    @Override
    public void move() {
        System.out.println(brand + " " + model + " is hovering in the air.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== HELICOPTER INFO ===");
        super.showInfo();
        System.out.println("Rotor Blades: " + rotorBlades);
    }
}
