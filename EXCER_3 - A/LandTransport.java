public class LandTransport extends Transportation {
    public LandTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on land.");
    }
}

// Subclasses
class Truck extends LandTransport {
    public Truck(String name, int capacity) {
        super(name, capacity);
    }
}

class SUV extends LandTransport {
    public SUV(String name, int capacity) {
        super(name, capacity);
    }
}

class Tricycle extends LandTransport {
    public Tricycle(String name, int capacity) {
        super(name, capacity);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle(String name, int capacity) {
        super(name, capacity);
    }
}

class Kariton extends LandTransport {
    public Kariton(String name, int capacity) {
        super(name, capacity);
    }
}
