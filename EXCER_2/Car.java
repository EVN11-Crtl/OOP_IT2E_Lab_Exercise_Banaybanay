public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;
    private String brand;   
    private String model;   

    // No-argument constructor
    public Car() {
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis No Yet";
        this.brand = "No Brand";
        this.model = "No Model";
    }

    // Parameterized constructor
    public Car(String color, String plateNo, String chassisNo, String brand, String model) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.brand = brand;
        this.model = model;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Color     : " + this.color);
        System.out.println("Plate No. : " + this.plateNo);
        System.out.println("Chassis No: " + this.chassisNo);
        System.out.println("Brand     : " + this.brand);
        System.out.println("Model     : " + this.model);
    }
}
