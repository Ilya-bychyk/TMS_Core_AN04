package Lesson10;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        // O(1)
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        // O(1)
        list.add(2, 1000);
        System.out.println(list);

        // O(n)
        System.out.println(list.get(4));

        // O(n)
        System.out.println(list.remove(1));

        // O(n)
        System.out.println(list.contains(new Integer(4)));
        list.sort(Comparator.reverseOrder());
        // Comparator.naturalOrder() - возрастание ASC
        // Comparator.reverseOrder() - убывание DESC
        // либо свой comparator можно написать


        // Пример сортировки по полю класса
        List<Person<Integer>> personList = new LinkedList<>();
        Person<Integer> person = new Person<>();
        person.setAge(100);
        Person<Integer> perso2 = new Person<>();
        perso2.setAge(200);
        personList.add(perso2);
        personList.add(person);
        System.out.println(personList);

        personList.sort(Comparator.comparing(p -> p.getAge()));
        System.out.println(personList);

        //
    }


    private static void arrayListExample() {
        List<Integer> list = new ArrayList<>(100);
        // добавление в конец
        // сложность добавления в конец - O(1)
        list.add(1);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(21);
        System.out.println(list);

        // O(n)
        list.add(2, 100);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(new Integer(1));
        System.out.println(list);

        // O(n)
        System.out.println(list.contains(new Integer(21)));


        // O(1)
        System.out.println(list.get(3));
    }

    private static void arrayCopyExample() {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 10;
        array[2] = 20;

        // добавляю на 1-й индекс новый элемент
        array[3] = array[2];
        array[2] = array[1];
        array[1] = 10;

        int index = 0;
        for (int i = array.length - 1; i > index; --i) {
            array[i] = array[i - 1];
        }
        array[1] = 10;

    }

    private static void genericPersonExample() {
        Person<String> personOne = new Person<>();
        personOne.setName("Vasya");
        personOne.setId("StringId");
        System.out.println(personOne);
        Person<Integer> integerPerson = new Person<>();
        integerPerson.setId(10);
        integerPerson.setName("Petya");
        System.out.println(integerPerson);
    }

    private static void genericsExample() {
        int i = compareInt(1, 2);
        double d = compareDouble(2., 3.);
        Integer compare = compare(new Integer(2), new Integer(4));
        compare(new Double(1.0), new Double(2.0));
    }

    private static int compareInt(int a, int b) {
        return a > b ? a : b;
    }

    private static double compareDouble(double a, double b) {
        return a > b ? a : b;
    }

    private static float compareFloat(float a, float b) {
        return a > b ? a : b;
    }

    private static <T extends Comparable<T>> T compare(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
