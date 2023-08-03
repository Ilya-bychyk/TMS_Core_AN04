package Lesson5.cars;

public class Truck extends Car {

    @Override
    protected void startEngine() {
        System.out.println("I'M FROM TRACK");
        super.startEngine();
    }
}
