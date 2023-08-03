package Lesson8;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        // Immutable - неизменяемыми (например класс String)
        // 1 сложение (конкатенация)
        String name = "Vlad";
        String a = "Hello," + " World" + "!!!" + "I'm " + name;
        System.out.println(a);
        // 1.a сложение
        String abc = "a".concat("bc");
        System.out.println(abc);

        // 2. split
        String names = "John  ,  Jason,  Elizabeth";
        String[] split = names.split(",");
        for (int i = 0; i < split.length; ++i) {
            System.out.println(split[i]);
        }
        String sentence = "I love Java so much";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; ++i) {
            System.out.println(words[i]);
        }

        // 3. indexOf
        String findDorInString = "a.b";
        System.out.println("Index of . in " + findDorInString + " = " + findDorInString.indexOf(".")); // выведет 1

        // 4. substring
        // substring(int)
        System.out.println("Taking substring from index 3: " + "0123456".substring(3));
        System.out.println("Taking substring from index 2 to 5 (exclusive): " + "abcdefg".substring(2, 5));

        // 5. regexp example
        // invalid code, will not work in case "Red Cap"
        String string = "1.Red Cap 2.Green 3.Yellow";
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; ++i) {
            String s = stringArray[i];
            int pointIndex = s.indexOf(".");// 1.Red
            System.out.println("Index of . is " + pointIndex);
            String substring = s.substring(pointIndex + 1);
            System.out.println(substring);
        }

        // \\d - число в regexp
        // . - это любой символ
        // \\. - это символ точки
        // regexp - regular expression (регулярное выражение, регулярка)
        System.out.println("Regexp");
        String[] split1 = string.split("\\d\\.");
        for (int i = 0; i < split1.length; ++i) {
            System.out.println(split1[i]);
        }

        // сравнение строк (equals)
        // Для объектов
        // Строка - это объект
        // Сравнение по значению - equals
        // Сравнение по ссылк - ==
        String personName = "Vasya";
        String studentName = new String("Vasya");
        System.out.println(personName.equals(studentName));
        System.out.println("Vasya".equals("Petya"));
        System.out.println(personName == studentName);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        System.out.println(int1 == int2);


        // пул строк (string pull)
        String person = "Vasya";
        String student = "Va".concat("sya");
        System.out.println(person == student);
        System.out.println(person.equals(student));


        // startsWith
        String[] teams = {"Pro-teamName1", "Pro-teamName2", "Am-teamName3"};
        for (int i = 0; i < teams.length; ++i) {
            String team = teams[i];
            if (team.startsWith("Pro-")) {
                System.out.println(team);
            }
        }

        // endsWith
        String[] teams2 = {"teamName1-pro", "teamName2-pro", "teamName3-am"};
        for (int i = 0; i < teams2.length; ++i) {
            String team = teams2[i];
            if (team.endsWith("-pro")) {
                System.out.println(team);
            }
        }

        // trim
        String stringWithExtraSpaces = "   Name    ";
        System.out.println(stringWithExtraSpaces);
        System.out.println(stringWithExtraSpaces.trim());

        String[] splitNames = "John  ,  Jason,  Elizabeth".split(",");
        for (int i = 0; i < split.length; ++i) {
            System.out.println(splitNames[i]);
            System.out.println(splitNames[i].trim());
        }
        //objectMethods();


        // replace
        // change format to xml
        String fileName = "example.pdf";
        String xmlFile = fileName.replace(".pdf", ".xml");
        System.out.println(xmlFile);

        String proTeamName = "Pro-teamName1";
        System.out.println("Team name without prefix: " + proTeamName.replace("Pro-", ""));

        // chartAt
        String exampleString = "ABC";
        char c = exampleString.charAt(2);
        System.out.println(c);

        // toLowerCase / toUpperCase
        // нижний / верхний регистр
        // abc / ABC
        String toLowwerCase = "AbCdEf".toLowerCase();
        String toUpperCase = "AbCdEf".toUpperCase();
        System.out.println("Red".equals("red"));
        System.out.println("Red".toLowerCase().equals("rEd".toLowerCase()));
        System.out.println("Red".equalsIgnoreCase("rEd".toLowerCase()));
        System.out.println(toLowwerCase);
        System.out.println(toUpperCase);

        // matches
        System.out.println("1.".matches("\\d\\."));
        System.out.println("1.qwewqe".matches("\\d\\."));

        // equals - сравнение на полное совпадение
        // compareTo - он умеет говорить больше / меньше / либо равно
        //                               +1       -1        0
        String first = "abg";
        String second = "abcd";
        // 'a'
        System.out.println((int)'c');
        System.out.println((int)'g');
        System.out.println(first.compareTo(second));
        System.out.println("abc".compareTo("abcd"));

    }

    private static void objectMethods() {
        Car car = new Car();
        Car truck = new Truck();
        System.out.println(car.getClass());
        System.out.println(truck.getClass());

        car.setName("a");
        Car car1 = new Car();
        car1.setName("b");
        System.out.println(car.equals(car1));
    }
}
