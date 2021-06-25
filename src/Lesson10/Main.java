package Lesson10;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setAge(10);
        firstPerson.setName("Vasya");

        Person secondPerson = new Person();
        secondPerson.setAge(10);
        secondPerson.setName("Vasya");

        System.out.println(firstPerson.equals(secondPerson));
        System.out.println(firstPerson == secondPerson);
        System.out.println(firstPerson.hashCode());
        System.out.println(secondPerson.hashCode());

//        "vasya", 20, man -> "vasya20man";
//        "vasya", 25, man -> "0xqwef";
//
//
//        {1,2,3,4,5} -> {"a", "b", "c", "d"};
//        1 -> "a";
//        1 -> "a";
//        2 -> "b"
//        3 -> "c"
//        4 -> "d";
//        5 -> "a";

        /**
         * 1) Если данные были одинаковые - то хеш обязан быть одинаковые
         *  "vasya", 20 -> "0xqwe"
         *  "vasya", 20 -> "0xqwe"
         *
         *  2) Если данные были разные - то хеш может быть одинаковый (из-за коллизий)
         *   "vasya", 20 -> "0xqwe"
         *   "vasya", 25 -> "0xqwe"
         *   "vasya", 30 -> "0xABC"
         *
         *   3) Если хеш коды разные, то исходные данные были разные
         * */

        /**
         * 1. Если объекты равны по equals, то они обязаны быть равны по hashcode
         *    (их hashcode должен быть одинаковый)
         * 2. Если объекты не равны по equals, то их хеш код МОЖЕТ быть одинаковый
         * 3. Если хеш коды разные, то объекты ОБЯЗАНЫ быть не равны по equals
         *
         * */





    }
}
