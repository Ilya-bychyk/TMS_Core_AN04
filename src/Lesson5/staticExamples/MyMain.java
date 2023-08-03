package Lesson5.staticExamples;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Person person1 = new Person("Petya");
        Phone phone1 = new Phone("+375251231212");
        person1.setPhone(phone1);

        Person person2 = new Person("Vasya");
        Phone phone2 = new Phone("+375007778899");
        person2.setPhone(phone2);

        person1.callPerson(person2);

        // static field example
        person1.COUNTER = 1;
        person2.COUNTER = 2;

        System.out.println(person1.COUNTER);
        System.out.println(person2.COUNTER);

        // print ids
        System.out.println("Person 1 id " + person1.getId());
        System.out.println("Person 2 id " + person2.getId());


        Double exp = MyMathUtil.EXP;
        MyMathUtil mathConstants = new MyMathUtil();
        Double exp1 = mathConstants.EXP;

        int abs = MyMathUtil.abs(-2);
        System.out.println("Abs for -2: " + abs);
        Scanner scanner = null;

        // MyMathUtil.PI = 100.; // can not be assigned anymore, because we made it final
        System.out.println(MyMathUtil.PI);

        MyMain.example();

        new MyMain().notStaticPrintNumber(1);
    }

    // Static methods can call only static methods as well, because
    // non-static methods might not exists at this time

    // static members can call only static members
    public static void example() {
        staticPrintNumber(2);
        // notStaticPrintNumber(2); doesnt work
    }

    public static void staticPrintNumber(int a) {
        System.out.println("Number " + a);
    }

    // not-static members can call static members
    public void notStaticPrintNumber(int a) {
        Double pi = MyMathUtil.PI;
        System.out.println("Number " + a);
    }
}
