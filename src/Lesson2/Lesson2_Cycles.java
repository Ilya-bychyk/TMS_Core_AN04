package Lesson2;

import java.util.ArrayList;
import java.util.Random;

public class Lesson2_Cycles {
    public static void main(String[] args) {

//        for (начальное состояние; условие выхода; изменение состояние) {
//
//        }
        // пример кода, который печатает на косоль числа
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
            // после выполнения блока кода, проиходит дейсвие над переменной i
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            // после выполнения блока кода, проиходит дейсвие над переменной i
        }
        // В первом случае
        // int i = 9;
        // ++i;
        // i < 10;

        // второй случай
        // int i = 9;
        // i++;
        // i < 10;

        //
        // i++ < 10;

        int j = 0;
        // можно опускать какие-то блоки, если они не нужны
        for (; j < 3; ++j) {
            System.out.println(j);
        }
        System.out.println("j at the end: " + j);

        System.out.println("Четные числа");
        for (int i = 0; i < 10 ; ++i) {
            System.out.println(i++);
        }
        System.out.println("Нечетные числа");
        for (int i = 0; i < 10 ; ++i) {
            System.out.println(++i);
        }

        // бесконечный цикл на форе
//        for (; true; ) {
//            System.out.println("Бесконечно");
//        }

        // пример
        for (int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Идем дальше");
                continue;
            }
            System.out.println("Идем дальше который не напечатается в случае если число четное");
        }

        // break - прерывает выполнение вообще, continue прерывает выполнение ТЕКУЩЕЙ итерации

        // простой пример использования for + if
        // Задача: просуммировать все нечетные числа от 0 до 10
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i; // sum = sum + i то же самое, что sum += i;
                /*
                * int a = 10;
                * a = a * 2; то же самое что a *= 2;
                * b /= 10; --> b = b / 10;
                * */
            }
        }
        System.out.println(sum);
        // Задача на дом: сделать суммирование четных чисел без if



        // Цикл while
//        while (условие) {
//            // выполняется если условие true
//        }
        int i = 0;
        // бесконечный вывод 0, потому что условие проверяется каждый раз после завершения блока кода while, и мы никак не меняем i
        while (i < 10) {
            System.out.println(i);
            break;
            // break поможет выйти из такого бесконечного цикла
        }


        // посчитать все числа от 1 до 10
        int counter = 1;
        int result = 0;
        while (counter <= 10 || ++counter < 100) {
            result += counter++; // result = result + counter++;
            /*
            * result = result + counter; // то же самое, что result += counter;
            * counter = counter + 1; // а это то же самое, что и ++counter ЛИБО counter++
            * */
        }
        System.out.println(result);


        // пример с выходом из бесконенчого цикла по условию
        int condition = 0;
        while (true) {
            System.out.println("Что-то делаем " + condition++);
            if (condition > 5) {
                break;
            }
        }


        // for - используется, когда заранее знаем кол-во итераций (например итерируем по списку размера n)
        // Пример задачки: сумма чисел от 0 до 10
        // while - используется когда заранее кол-во итераций нам не известно, но есть какое-то условие меняющееся
        // пример задачки: сумма случайных чисел, пока сулчайное число < 0.5

        double randomSum = 0;
        double randNumber = 0;
        while (randNumber < 0.9) {
            randomSum += randNumber;
            randNumber = new Random().nextDouble();
            System.out.println("Random number: " + randNumber);
        }
        System.out.println(randomSum);


        // do while
//        do {
//
//        } while (условие)
        double randomSum2 = 0;
        double randNumber2 = 0;
        do {
            randomSum2 += randNumber2;
            randNumber2 = new Random().nextDouble();
        } while (randNumber2 > 0.25);
        System.out.println(randomSum2);
    }
}
