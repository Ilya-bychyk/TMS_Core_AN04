package Lesson6.lesson.methodConflicts;

public class Main {
    public static void main(String[] args) {
        A a = new ClassExample();
        ClassExample classExample = (ClassExample) a;
    }

    private static void callMethod(A a) {
        a.f();
    }

    private static void callMethod(B b) {
        b.f();
    }

    private static String abs(int a) {
        return Integer.toString(a);
    }

    private static String abs(double a) {
        return Double.toString(a);
    }
}
