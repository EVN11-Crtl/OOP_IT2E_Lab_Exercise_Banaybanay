public class Main {
    public static void main(String[] args) {
        // Create objects
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);
        Shape circle = new Circle(4);

        System.out.println("Shape Area");

        // Display results
        square.displayArea();
        rectangle.displayArea();
        triangle.displayArea();
        circle.displayArea();
    }
}
