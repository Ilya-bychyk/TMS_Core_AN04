package Lesson6.lesson.person;

public class Main {

    // Проблема ромбовидного наследования
    //
    public static void main(String[] args) {
        Person person = new Student();
        Student teacher = (Student) person;
    }
}
