package Lesson1;

import java.math.BigDecimal;

public class Main {

    /*
    * public int sum() { }  - вот это метод
    *
    * a.sum() - вызов метода sum у переменной a
    *
    * */


    // метод
    public static void main(String[] args) {
        // Типы данных
        // числовые
        // примитивыне типы данныз
        // int (integer) - -11231231, -1, 0, 1, 2, 3, +100000000000000000000000000000000000 (max value 2^32 - 1)
        // double (дробные числа) 0.123, -0.5
        // long (целое число) - умеет хранить больше че int (2^64 - 1)
        // boolean - true либо false

        // объект
        // String (строки), например "I love Java"
        // Integer (аналог int, но объект)
        // Double
        // Char
        // Boolean
        // Long


        // char 'a', '%', '-'
        // float (дробное число) 0.213
        // short 2^16 - 1
        // byte [-128, 127]
        int a = 1; // int - тип данных, a - название переменной, = - оператор присваивания, 1 - конкретное число
        double b = 0.2;
        long c = 1000;
        String name = "Vlad";
        // int willNotWork = "qwe";


        int x1 = 10;
        int x2 = 20;
        x1 = x2;

        // + - сложение, - вычитание, / деление, * умножение
        int integer1 = 2;
        int integer2 = 2;
        int integer3 = 2;
        // печать на консоль
        // чтобы не писать  System.out.println, можно написать sout и нажать enter
        System.out.println(integer1 * integer2 + integer3);

        Double double1 = 0.3;
        Double double2 = 0.3;
        Double double3 = 0.3;
        System.out.println(double1 + double2 + double3);

        // BigDecimal, BigInteger
        BigDecimal decimal = new BigDecimal(0.3);
        System.out.println(new BigDecimal("0.3").add(new BigDecimal("0.3").add(new BigDecimal("0.3"))));


        // приведение типов
        int someNumber = 1;
        double anotherNumber = 1.8;

        System.out.println((double) someNumber);
        System.out.println(anotherNumber);
        System.out.println((int) anotherNumber);

        // деление целых чисел и присвоение в целое число
        int integerNumber = 5 / 3;
        System.out.println(integerNumber);

        boolean isGreater = 5 > 0; // > строго больше, < строго меньше, >= больше либо равно, <=, ==
        System.out.println("5 > 5 " + (5 > 5));
        System.out.println("5 >= 0 " + (5 >= 5));
        System.out.println("5 < 0 " + (5 < 0));
        System.out.println("5 == 0 " + (5 == 0));
        System.out.println("5 == 5 " + (5 == 5));
        System.out.println("5 > 0 " + (5 > 0));


        // int q = 5 / 0;

        // символ сноса строки \n
        String string = "Line 1\nLine 2";
        System.out.println(string);
        // длина строки
        int length = string.length();
        // camelCase notation, snake_notation
        // Общий синтаксиc: variableName.methodName(....)
        boolean isStringEqualsToAbc = string.equals("abc");
        boolean isStringEmpty = string.isEmpty();
    }
}