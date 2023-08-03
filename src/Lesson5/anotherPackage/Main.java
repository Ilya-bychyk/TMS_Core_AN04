package Lesson5.anotherPackage;

import Lesson5.classes.Person;
import Lesson5.classes.Student;

public class Main {
    public static void main(String[] args) {
//        // Person is in another package
//        Person person = new Person();
//        // person.name can not be accessed
//        person.setName("Vasya");
//        person.setAge(10);
//        System.out.println(person);
//
//        Student student = new Student();
//        student.setAge(20);
//        student.setName("Petya");
//        student.setGroup(1);
//        int[] marks = {1, 3, 3};
//        student.setMarks(marks);
//        System.out.println(student.toString());
//
//        //
//        int a = 10;
//        String b = "abcc";
//        print(a);
//        print(b);

        referenceExample();
    }

    private static void referenceExample() {
        Student st = new Student();
        st.setName("Vasya");
        st.setGroup(10);
        System.out.println(st);
        Person p = st;
        System.out.println(p);
    }

    // перегрузка метода print(int a)
    private static void print(String string) {
        System.out.println(string);
    }

    private static void print(int a) {
        System.out.println(a);
    }

    public static void objectExample() {
//        Object object = null;
//        object.toString();
//        object.equals();
//        object.hashCode();
    }
}
