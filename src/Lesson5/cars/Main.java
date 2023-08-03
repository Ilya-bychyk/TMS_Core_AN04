package Lesson5.cars;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Engine engine = new Engine("Engine of track");
        truck.setEngine(engine);
        truck.run();
    }
}
