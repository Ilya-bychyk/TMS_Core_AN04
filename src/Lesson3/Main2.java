package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        bubbleSort();
        // про многомерные массивы
        // частный случай - двумерные массивы, например шахматная доска, табилца в xsl, координаты в морском бою, матрицы и тд, крестики нолики
        // координатная плоскасть (к 2D играм)
        // Двумерный массив - по-сути это поле клеток NxM

        // для одномерных
        int[] array = { 1, 2, 3, 4 }; // 1, 2 и тд - элементы массива одномерного
        int[] anotherArray = new int[10];

        int[][] matrix = {
                { 1, 2, 3, 4 }, // {1,2,3}, {...}  и тд - это элементы первого (внешнего) массива
                {-1, -2, -3, -4 }, // 1,2,3 - элементы внутреннего (второго) массива
                {-1, 0, 1, 5}
        };

        // однмерные массив
        anotherArray[1] = 10;
        int someNumber = anotherArray[2];

        int[][] anotherMatrix = new int[3][4];
        // двумерный массив
        anotherMatrix[1][2] = -100;
        // т.к. у нас "внешний массив хранит другие массивы, мы можем ему присвоить другой массив
        int[] anotherMatrix1 = anotherMatrix[1];
        int number = anotherMatrix1[2]; // => anotherMatrix[1][2]

        System.out.println(anotherMatrix[1][2] + ", вторым способом " + number);



        // приимер с записью матрицы в одномерный массив
        int nSize = 5;
        int mSize = 10;
        int[] matrixInOneArray = new int[nSize * mSize];
        // обратиться к элементу ij можно использовать запись i * m + j


// хочу рандомить числа от -10 до 10;
        // nextInt(11) вернет от 0 до 10

        // 0....10
        // зарандомило 0, отнимаю 5 = -5
        // зарандомило 1, отнимаю 5 = -4
        // зарандомило 2, отнимаю 5 = -3
        // зарандомило 3, отнимаю 5 = -2
        // ...
        // зарандомило 10, отнимаю 5 = 5
        // В итоге имеем промежуток рандом [-5...5]


        // Задача зарандомить числа в промежутке [-10; 10]
        // Умеем мы рандомить от 0 до n;
        // [0...n]
        // [-10...n]
        // [-10..10]
        // [0...n]
        // n-10 = 10;


        // ДЗ: Рандомить числа в промежутке от [-20; 20]
        // TODO придумать задачу на сложный рандом промежутка


        int n = 5;
        int m = 10;
        // Заполним двумерным массив рандомынми числами [-10; 10] и напечатаем
        int[][] randMatrix = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                randMatrix[i][j] = new Random().nextInt(21) - 10;
                // можно здесь выводить
            }
        }

        // вывод на консоль
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(randMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Задача: найти сумму элементов главной диагонали
        /*
        * 1 2 3 0
        * 4 5 6 0
        * 7 8 9 0
        * 0 0 0 0
        * */
        int sum = 0;
        // можно использовать известные n и m вместо .length
        for (int i = 0; i < randMatrix.length; ++i) {
            for (int j = 0; j < randMatrix[i].length; ++j) {
                if (i == j) {
                    sum += randMatrix[i][j];
                }
            }
        }
        System.out.println("Sum " + sum);


        /// TODO ДЗ: Найти сумму элементов побочной диагонали
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        *
        * Побочная диагональ - 3 5 7
        *
        *
        *
        * TODO дз по желанию
        * Транспонирование
        * На вход:
        * 1 2 3 0
        * 4 5 6 0
        * 7 8 9 0
        *
        * Транспонирование (сделать стоблцы строками):
        * 1 4 7
        * 2 5 8
        * 3 6 9
        * 0 0 0
        * */

        // динамическое программирование
        // начальное состояние [0][0][0][0] = 1;
        // [0][1][0][0] -> [0][1][0][0]
        // [n][n][n][n] ->


        int[][][] cube = {
                {
                        {1,2,3}
                },
                {
                        {4,5,6}
                },
                {
                        {7, 8, 9}
                }
        };
        for (int i = 0; i < cube.length; ++i) {
            for (int j = 0; j < cube[i].length; ++j) {
                for (int k = 0; k < cube[i][j].length; ++k) {
                    System.out.println(cube[i][j][k]);
                }
            }
        }
    }

    private static void bubbleSort() {
        // Написать код, который "выталкивает" максимальное число в массиве на последний индекс
        // например -4 10 5 -2
        // в итоге я хочу, чтобы 10-ка была на последенм (3-м индексе)
        // давайте решим задачу, сравнивая i-е число и i+1-е


        int[] array = { -4, 10, 5, -2 };
        for (int i = 0; i < array.length - 1; ++i) {
            int left = array[i]; // -2
            int right = array[i + 1]; // ошибка, выйдем за границы массива при i=3 и условии i < array.length;
            if (left > right) {
                array[i + 1] = left;
                array[i] = right;
            }
            // array:5 -4 10
            // index:0 1   2
            // i и i+1
            // 0 и 1
            // 1 и 2
            // 2 и 3
            // и тд
        }

        System.out.println(array[array.length - 1]);

        // bubble sort
        int[] numberArray = { 2, 5, -1, -100, 32, 5, 0 };

        // 1) 10 9 8 7 6 ... 0
        // 2) int 10; 0 1 2 3 4 5 6 ... 10
        // 10 - i -> [i = 0 -> 10], [i = 1 -> 9] ... [i = 10 -> 0]

        for (int rightBorder = numberArray.length - 1; rightBorder >= 0; --rightBorder) {
            for (int i = 0; i < rightBorder; ++i) {
                int left = numberArray[i];
                int right = numberArray[i + 1];
                if (left > right) {
                    numberArray[i + 1] = left;
                    numberArray[i] = right;
                }
            }
        }
        printArray(numberArray);

        // ДЗ: Сделать вариант, в котором мы идем слева-направо, и потом идем в обратную сторону, выталкивая меньший элемент влево
        //  -100 -1, 2 ,0, 5, 5,  32
        // Т.е. тут уменьшаем и левую и правую границы

        // А можно не мучить себя и юзать готовые методы :)
        Arrays.sort(numberArray);
    }

    // для удобства вывода элементов массива на консоль
    // сам написал
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
