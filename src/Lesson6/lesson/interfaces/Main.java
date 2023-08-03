package Lesson6.lesson.interfaces;

import Lesson6.lesson.interfaces.duckAndSuperman.Duck;
import Lesson6.lesson.interfaces.duckAndSuperman.Flyable;
import Lesson6.lesson.interfaces.duckAndSuperman.Superman;
import Lesson6.lesson.interfaces.duckAndSuperman.Swimmable;

public class Main {
    public static void main(String[] args) {
        Swimmable duck = new Duck();
        Swimmable superman = new Superman();

        //startFly(duck);
        //startFly(superman);

        startSwimable(duck);
        startSwimable(superman);
    }

    public static void startFly(Flyable flyable) {
        System.out.println("Starting game with flyable");
        System.out.println("Wings...");
    }

    public static void startSwimable(Swimmable swimmable) {
        System.out.println("Starting game with swimmable");
        swimmable.swim();
    }
}
