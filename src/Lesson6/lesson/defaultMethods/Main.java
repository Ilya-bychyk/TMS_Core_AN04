package Lesson6.lesson.defaultMethods;

public class Main {
    public static void main(String[] args) {
        Elf e = new Elf();
        e.attack();

        new Griphon().attack();

        String name = Warrior.NAME;
        System.out.println(name);
    }
}
