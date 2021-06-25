package Lesson10;

import Lesson6.lesson.methodConflicts.B;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // O(logn)
        Set<BadPerson> set = new TreeSet<>();
        set.add(new BadPerson("1", 1));
        System.out.println(set);
    }

    private static void hashSet() {
        // Set - множество уникальных элементов
        Set<Integer> set = new HashSet<>();
        // O(1)
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        // O(1)
        System.out.println(set.contains(new Integer(3)));

        // O(1)
        set.remove(new Integer(1));

        System.out.println(set);

        // ? containsAll, retainAll

        exampleWithoutEqualsAndHashcode();
    }

    private static void exampleWithoutEqualsAndHashcode() {
        Set<BadPerson> set = new HashSet<>();
        set.add(new BadPerson("Vasya", 10));
        set.add(new BadPerson("Vasya", 10));
        set.add(new BadPerson("Petya", 2));
        set.add(new BadPerson("Petya", 3));
        set.add(new BadPerson("Petya", 4));
        System.out.println(set);
    }
}
