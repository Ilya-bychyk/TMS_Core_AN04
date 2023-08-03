package Lesson3;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        int n = 2000;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println(array);
            int a = 5 + 10 * 10032131;
            System.out.println(a);
        }

        // 2000 * (время печати + время подсчета a) = 2000*C
        // Сложность кода выше O(n) = говорит что наш код выполнится не более чем за n*C операций

        int a = 5 * 1; // O(1) = C = [1=n] = O(n) = n*c = [n=1] = c

        int m = 1000;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.println(i + j);
            }
        }
        // O(m^2) - сложность двойного цикла

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < m / 2; ++j) {
                System.out.println(i + j);
            }
        }
        // O(m^2/2) = O(m^2)


        // Есть такая сортировка как quickSort (и еще есть mergeSort)
        // Их сложность O(n*logn)

        // Задача: есть массив отсортированный по возрастанию
        // хочу найти элемент, равный x
        // 5, 12, 20, 100 ...... 350

        // 1-й вариант обойти массив от 0 до n, сравнивая элементы
        // Сложность? O(n)

        // 2-й вариант
        // Бинарный поиск
        // 1 12 20 30 40 50 55 70 80 95 100
        // n / 2 / 2 / 2 = n / 2^k
        // n / 2^k = 1
        // k = log2(n)
        // O(logn) | logn < n
        // 10^20 ~ 10^12 секунд = ~32 тысячи лет (10^8 - 1 секунд)
        // log(10^20) = 20*log(10) = ~60 секунд
        //
    }
}
