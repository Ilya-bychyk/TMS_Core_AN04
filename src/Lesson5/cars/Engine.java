package Lesson5.cars;

public class Engine {

    public String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        System.out.println("Engine is starting with name " + name);
    }
}
