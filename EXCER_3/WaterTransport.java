public class WaterTransport extends Transportation {
    public WaterTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is sailing on water.");
    }
}

// Subclasses
class Boat extends WaterTransport {
    public Boat(String name, int capacity) {
        super(name, capacity);
    }
}

class Ship extends WaterTransport {
    public Ship(String name, int capacity) {
        super(name, capacity);
    }
}
