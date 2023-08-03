package Lesson6.lesson.interfaces.duckAndSuperman;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("I'm duck, I can fly");
        shakeWings();
    }

    @Override
    public void swim() {
        System.out.println("I'm duck, I can swim");
        shakeWings();
    }

    private void shakeWings() {
        System.out.println("Машу крылышками");
    }
}
