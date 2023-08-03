package Lesson5.staticExamples;

// Util классы - вспомогательные классы
public class MyMathUtil {
    public final static Double PI = 3.14;
    public final static Double EXP = 2.7;

    public static int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

}