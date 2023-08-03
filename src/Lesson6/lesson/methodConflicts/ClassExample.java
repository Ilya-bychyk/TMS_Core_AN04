package Lesson6.lesson.methodConflicts;

public class ClassExample implements A, B {
    @Override
    public void f() {
        System.out.println("ClassExample");
    }

//    @Override
//    public Integer calculate() {
//        return null;
//    }
//
//    @Override
//    public String calculate() {
//        return null;
//    }
}
