package Lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 123;
        int d = 512;
        int e = 512231;

        // { } - не блок кода, а инициализация массива
        int[] intArray = { 1, 2, 3 };
        // индексы в массиве начинаются с 0
        // intArray[index] - взять число по индексу "index" из массива "intArray"
        // индексы с 0
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        // Как и абстрактная полка, массив имеет ограниченную длину
        // Длину менять нельзя, если попытатья взять число за пределами массива - получим ошибку
        //System.out.println(intArray[3]);

        System.out.println("Длина массива " + intArray.length);

        // в массивы можно числа класть
        System.out.println(intArray[0]);
        intArray[0] = 100;
        System.out.println(intArray[0]);

        // Другой способ инициализации массива
        // как создать пустой массив?
        int[] emptyArrayWithSomeLength = new int[10]; // 10 - размер
        System.out.println(emptyArrayWithSomeLength.length); // здесь будет число 10, а НЕ 0
        emptyArrayWithSomeLength[0] = 10;
        emptyArrayWithSomeLength[1] = 11;
        emptyArrayWithSomeLength[2] = 12;
        System.out.println(emptyArrayWithSomeLength[0]);
        System.out.println(emptyArrayWithSomeLength[1]);
        System.out.println(emptyArrayWithSomeLength[2]);

        String[] arrayChart = new String[10];
        System.out.println(arrayChart[0]); // здесь будет некий "null" - что это такое?

        double[] doubleArray = new double[5];
        System.out.println(doubleArray[0]);

        //int i = intArray[-1];// ошибка
        //System.out.println(i);


        // Задачка с суммой чисел
        // У нас имеется на входе все наши зарплаты за последний год
        // Хочу посчитать всю сумму
        int[] yearSalarys = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // первый способ
        // sum = yearSalarys[0] + yearSalarys[1] + .. + yearSalarys[9]


        /*
        * Мы умеем итерировать от числа до числа (например от 0 до 10 циклом for)
        * Мы умеем забирать из массива по индексу (array[i] взять i-й элемент у array)
        * Мы умеем получать длину массива array.length
        * */
        for (int j = 0; j < yearSalarys.length; ++j) {
            sum += yearSalarys[j];
        }
        System.out.println(sum);


        String string = "abcdef+"; // символы a b c d e f +
        // хочу каждую буковку напеатать на консоль отдельно
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            System.out.println(chars[i]);
        }

        String[] usersName = { "vasya", "petya", "kolya"};
        for (int i = 0; i < usersName.length; ++i) {
            System.out.println("Посылаю сообщение человеку с именем " + usersName[i]);
        }


        // Есть массив чисел, хочу массив чисел развернуть задом наперед
        // например из {1, 2, 3, 4, 5} получить {5, 4, 3, 2, 1}
        int[] arrayNumber = {1, 2, 3, 4, 5};
        // сложно
        // 1 2 3 4 5
        // 2 1 3 4 5
        // 2 3 1 4 5
        // ....
        // 2 3 4 5 1
        // 3 2 4 5 1
        // ...
        // 5 4 3 2 1
        // попроще
        // 1 2 3 4 5
        // 5 4 3 2 1

        for (int i = 0; i < arrayNumber.length / 2; ++i) {
            int leftNumber =  arrayNumber[i];
            int rightNumber = arrayNumber[arrayNumber.length - 1 - i];
            arrayNumber[i] = rightNumber;
            arrayNumber[arrayNumber.length - 1 - i] = leftNumber;
        }
        for (int i = 0; i < arrayNumber.length; ++i) {
            System.out.println(arrayNumber[i]);
        }


        // пример двойного цикла
        for (int i = 0; i < arrayNumber.length; ++i) {
            for (int j = 0; j < arrayNumber.length; ++j) {
                // что-то сделать
            }
        }
        //
    }
}
