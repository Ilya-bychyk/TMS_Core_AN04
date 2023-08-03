package Lesson6.lesson.defaultMethods;

public interface Warrior {
    String NAME = "NAME"; // public static final String name = "NAME";

    default void attack() {
        System.out.println("Default implementation");
    }
}
