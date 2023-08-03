package Lesson6.homework;

public class Car {
    private String name;
    private Integer distance;
    private final Engine engine;
    private final FuelTank fuelTank;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.distance = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void turnOn() {
        if (fuelTank.getCurrentAmount() > 0) {
            engine.turnOn();
        } else {
            System.out.println("Недостаточно топилва, заправьте машину");
        }
    }

    public void turnOff() {
        engine.turnOff();
    }

    public void fill(int amount) {
        fuelTank.fill(amount);
    }

    public void run() {
        if (engine.isStarted()) {
            distance += 100;
            fuelTank.wasteFuel(10);
            System.out.println("Машина проехала какое-то расстояние");
        } else {
            System.out.println("Двигатель выключен, заведите машину");
        }
    }
}
