package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // O(logn)
        Map<Integer, String> map = new TreeMap<>();
        map.put(10, "ten");
        map.put(5, "five");
        map.put(3, "three");
        System.out.println(map);
    }

    private static void hashMap() {
        //        Vasya - 10;
//        Vasya - 20;
//        Petya - 30;
//
//        // считаем что одинаковых возрастов нет
//        возраст -> имя;
//        10 - vasya;
//        20 - vasya;
//        30 - petya;
//
//        + vasya' -> 10;
//            10 -> vasya';
//            20 - vasya;
//        30 - petya;
        // Задача каждому слову посчитать его кол-во
        String text = "I love java java is very good I'm good too.";
        Map<String, Integer> map = new HashMap<>();
        String[] s = text.split(" ");
        List<String> words = Arrays.asList(s);
        for (String word : words) {
            // O(1)
            if (map.containsKey(word)) {
                // O(1)
                Integer count = map.get(word);
                ++count;
                // O(1)
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }


        //Map<Integer, List<Person<Integer>>> map = new HashMap<>();
        System.out.println(map);
    }
}
