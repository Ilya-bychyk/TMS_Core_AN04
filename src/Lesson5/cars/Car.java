package Lesson5.cars;

// ALT + INSERT
public class Car {
    private String name;
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        this.startEngine();
        System.out.println("Car is running with name " + name);
    }

    protected void startEngine() {
        System.out.println("Starting engine " + engine.name);
    }
}
