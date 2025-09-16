public abstract class Transportation {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;
    protected double engineCapacity;
    protected String fuelType;

    public Transportation(String brand, String model, int year,
                          double maxSpeed, double engineCapacity, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public abstract void move();

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Engine Capacity: " + engineCapacity + "L");
        System.out.println("Fuel Type: " + fuelType);
    }
}
