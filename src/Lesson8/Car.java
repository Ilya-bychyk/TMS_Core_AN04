package Lesson8;

import Lesson5.cars.Engine;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine);
    }
}
