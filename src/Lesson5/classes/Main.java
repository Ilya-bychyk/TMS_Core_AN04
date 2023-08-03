package Lesson5.classes;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        person.setName("qwe");
        System.out.println(person);

        Student student = new Student();
        student.setCourse(1);
        student.setGroup(10);
        int[] marks = {4, 4, 4};
        student.setMarks(marks);
        student.setAge(18);
        student.setName("Student name #1");
        student.setAge(1);
        System.out.println(student.getCourse());
        System.out.println(student.getName());
    }
}
