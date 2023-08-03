package Lesson7.exceptions;

import java.io.FileNotFoundException;
import java.util.Random;

public class Main {
    public static void main(String[] args) { // throws Exception {
        //tryDivide();
        // Если машина не заправлена - IllegalStateException
        // Если движок не заведен - RuntimeException
//        try {
//            runCar();
//        } catch (IllegalStateException e) {
//            System.out.println("Пожалуйста, заправь машину " + e.getMessage());
//        } catch (RuntimeException e) {
//            System.out.println("Почему-то двигатель не завелся. " + e.getMessage());
//        }

//        try {
//            anotherRunCar();
//        } catch (EmptyFuelTankException e) {
//            System.out.println("Пожалуйста, заправь машину " + e.getMessage());
//        } catch (CarEngineException e) {
//            System.out.println("Почему-то двигатель не завелся. " + e.getMessage());
//        }

//        try {
//            anotherRunCar();
//        } catch (RuntimeException e) { // можно ловить Throwable, Exception, RuntimeException и конкретные тоже
//            System.out.println("Машина почему-то не поехала " + e.getMessage());
//        }

//        try {
//            anotherRunCar();
//        } catch (CarEngineException e) {
//            System.out.println("Проблема с движком " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Машина почему-то не поехала " + e.getMessage());
//        }
        // RuntimeException - unchecked (непроверяемые)
        // Exception - checked (проверяемые)

//        System.out.println("Calling method...");
//        //throwExceptionMethodWithTry();
//        //throwExceptionMethod();
//        try {
//            myMethod();
//        } catch (Exception e) {
//            System.out.println("Было исключение " + e.getMessage());
//        } finally {
//            System.out.println("Я выполняюсь всегда, было исключение или нет - не важно");
//        }
        int i = myMethod();
        System.out.println(i);
    }

    private static int myMethod() {
        System.out.println("myMethod is called");
        int randomNumber = new Random().nextInt(10);
        try {
            if (randomNumber < 5) {
                return randomNumber;
            } else {
                System.exit(0);
                return -1;
            }
        } finally {
            System.out.println("Я выполняюсь всегда, даже есть есть return");
        }
    }

    private static void throwExceptionMethodWithTry() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Выпал checked exception");
        }
    }

    // throws - бросаю, могу выбросить исключение
    private static void throwExceptionMethod() throws Exception {
        if (new Random().nextInt(10) < 5) {
            System.out.println("Бросаю");
            throw new FileNotFoundException();
        } else {
            System.out.println("Не выбросил эксепшн");
        }
    }

    private static void anotherRunCar() {
        boolean isEngineStarted = false;
        boolean haveFuel = true;

        if (haveFuel) {
            if (isEngineStarted) {
                System.out.println("Едем");
            } else {
                throw new CarEngineException("Двигатель не заведен, потому что сломан");
            }
        } else {
            throw new EmptyFuelTankException("Не заправлена машина");
        }
    }

    private static void tryDivide() {
        try {
            // здесь выбрасывается исключение
            int divide = divide(10, 5);
            // если все хорошо, то выполнение кода идет дальше
            System.out.println(divide);
        } catch (IllegalArgumentException myException) { // обычно e - exception
            // здесь поймали и можно обработать
            String exceptionMessage = myException.getMessage();
            System.out.println("Что-то пошло нет так " + exceptionMessage);
        }
        System.out.println("Продолжение программы...");
        // ..
    }

    // Хочу делить только числа > 0 (допускать деление таких чисел)
    public static int divide(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("\"Нельзя делить числа <= 0\"");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("\"Нельзя делить числа <= 0\"");
        }
        return a / b;
    }

    private static void runCar() {
        boolean isEngineStarted = true;
        boolean haveFuel = false;

        if (haveFuel) {
            if (isEngineStarted) {
                System.out.println("Едем");
            } else {
                throw new RuntimeException("Двигатель не заведен, потому что сломан");
            }
        } else {
            throw new IllegalStateException("Не заправлена машина");
        }
    }
}
