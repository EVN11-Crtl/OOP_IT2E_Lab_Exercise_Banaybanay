public class AirTransport extends Transportation {
    public AirTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is flying in the sky.");
    }
}

// Subclasses
class Plane extends AirTransport {
    public Plane(String name, int capacity) {
        super(name, capacity);
    }
}

class Helicopter extends AirTransport {
    public Helicopter(String name, int capacity) {
        super(name, capacity);
    }
}
