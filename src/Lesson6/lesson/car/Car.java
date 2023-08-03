package Lesson6.lesson.car;

public abstract class Car {
    private final String name;
    private Integer distance;

    public Car(String name) {
        this.name = name;
    }

    public abstract void turnOn();

    // pattern name - шаблонный метод
    public void run() {
        turnOn();
        // beep();
        System.out.println("Car " + name + " is running");
    }
}
