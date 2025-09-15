public class Shape {
    public double calculateArea() {
        return 0.0; 
    }

    public void displayArea() {
        System.out.println(getClass().getSimpleName() + " Area: " + calculateArea());
    }
}
