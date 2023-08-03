package Lesson4;

import java.util.Random;

public class HomeworkSolution {
    public static void main(String[] args) {
        // aNameAnotherWord;
        int a_Name = 2;
        // форматирование кода
        // ctrl A
        // ctrl ALT L

        int number =  5 + 3 / 2;
        boolean flag = 5 >= 12;

        for (int i = 0; i < 10; i += 2) {

        }
        String string = "qweq";
        ///////////////////////
        // 1.3  Найти средне арифметическое элементов массива, превосходящих некоторое число С.
        int n = 10;
        int[] array = new int[n];
        int c = 12;
        for (int i = 0; i < n; ++i) {
            array[i] = new Random().nextInt(20);
        }

        int sum = 0;
        int numberCount = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > c) {
                sum = sum + array[i];
                numberCount = numberCount + 1;
            }
        }
        double avarageSum = (double) sum / numberCount;
        System.out.println(avarageSum);


        //task3_1();
        task5_3();
    }

    // 2.1) Найти наименьший нечетный элемент.
    // не называйте так методы, так неправильно, сделал для удобства
    private void task2_1() {
        // [-15; 17]
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new Random().nextInt(33) - 15;
        }
        // при условии что n > 1
        int min = array[0]; // Integer.MAX_VALUE; Можно взять правую границу отрезка (17)
        for (int i = 1; i < n; ++i) {
            if (array[i] % 2 == 1 && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
    // 2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массив
    private static void task2_3() {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new Random().nextInt(33) - 15;
        }
        printArray(array);
        // считаем n > 1
        int max = array[0];
        int indexMax = 0;
        // 2 10 5 3 100 1
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        // задача смены элементов в массиве
        int temp = array[0];
        array[0] = array[indexMax];
        array[indexMax] = temp;
        System.out.println(max + " " + indexMax);
        printArray(array);
    }

    // 3.1) В произвольно заполненном массиве проверить все ли числа разные
    private static void task3_1() {
        // [0; 20]
        int n = 15;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new Random().nextInt(21);
        }
        // при условии что n > 1
        // 1 2 5 10 8 6
        // boolean переменные называют флагами
        boolean isUnique = true;
        for (int i = 0; i < array.length; ++i) {
            if (!isUnique) { // isUnique == false
                break;
            }
            int numberToCheck = array[i];
            for (int j = i + 1; j < array.length; ++j) {
                if (numberToCheck == array[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        printArray(array);
        System.out.println(isUnique);
    }

    private static void task3_3() {
        // [0; 100]
        // 0 4 5 7 0
        // 0 - 2
        // 1 - 0
        // 2 - 0
        // 3 - 0
        // 4 - 1
        // 5 - 1
        // 6 - 0
        // 7 - 1
        // Идея:
        // 0 1 2 3 4 5 6 7
        // 2 0 0 0 1 1 0 1

        // [0; 10] [a;b]
        int b = 10;
        int[] array = { 0, 2, 5, 7, 10, 10};
        // число к количеству
        int[] numberToAmount = new int[b];
        // numberToAmount[i] - это сколько раз встретилось число i
        boolean isUnique = true;
        for (int i = 0; i < array.length; ++i) {
            if (++numberToAmount[array[i]] > 1) {
                isUnique = false;
                break;
            }
        }

    }
    // 5.3) Найти минимальное число из диагонали, стоящей над главной
    private static void task5_3() {
        int n = 5;
        int m = 5;
        int[][] matrix = new int[n][m];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = new Random().nextInt(20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
//        for (int i = 1; i + 1 < n; ++i) {
//            if (matrix[i][i + 1] < min) {
//                min = matrix[i][i + 1];
//            }
//        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j == i + 1 && matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Min= " + min);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + "\t");
        }
    }
}
