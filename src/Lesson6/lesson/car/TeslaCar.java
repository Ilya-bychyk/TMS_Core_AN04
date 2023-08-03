package Lesson6.lesson.car;

public class TeslaCar extends Car {

    public TeslaCar(String name) {
        // this(..) - вызов конструктора этого же класса
        super(name); // вызов констурктора предка
    }

    @Override
    public void turnOn() {
        System.out.println("Turning engine by fingerprint");
    }
}