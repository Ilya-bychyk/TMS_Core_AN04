package Lesson6.lesson.car;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning truck engine....");
    }
}
