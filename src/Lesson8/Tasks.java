package Lesson8;

public class Tasks {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }

    private static void task5() {
        // Есть текст, предложения разделены точкой. В каждом предложении слова разделены пробелом (без других символов)
        // Задача: вывести измененый текст, в котором будут присутствовать только предложения состоящие из 3-5 слов, ЛИБО
        // если в предложении есть слово палиндром, то тоже оставляем (не важен размер)
        // И писать в консоль почему мы оставили предложение в тексте

        String text = "I'm in love with Java very very much 123321. I'm student of teachmeskills. I'm trying to learn this "
                + " f*cking strings and seems like it's impossible. I hope I can";

        // Разбить текст на предложения
        // Предложение надо разбить на слова
        // Проверяем кол-во слов в предложении: если не подходит, то проверяем слова на палиндром

        // \\. - символ точки в regexp
        StringBuilder resultText = new StringBuilder();

        String[] sentences = text.split("\\.");
        for (int i = 0; i < sentences.length; ++i) {
            String[] words = sentences[i].split(" ");
            if (3 <= words.length && words.length <= 5) {
                resultText.append(sentences[i]).append(".");
                System.out.println("Because sentence " + sentences[i] + " words count between 3 and 5");
            } else {
                boolean isPolyndrom = false;
                String polyndrom = null;
                for (int j = 0; j < words.length; ++j) {
                    String word = words[j];
                    if (isPolyndrom(word.trim())) {
                        isPolyndrom = true;
                        polyndrom = word;
                        break;
                    }
                }
                if (isPolyndrom) {
                    resultText.append(sentences[i]).append(".");
                    System.out.println("Because sentence contains polyndrom " + polyndrom);
                }
            }
        }
        System.out.println(resultText);
    }

    private static void task1() {
        // Дана строка, вырезать подстроку, начиная с символа A, до символа B
        String string = "Some text then goes letter A, I love Java, and then goes letter B and text";
        int indexOfA = string.indexOf("A");
        int indexOfB = string.indexOf("B");
        String substring = string.substring(indexOfA + 1, indexOfB);
        System.out.println(substring);
        String expected = ", I love Java, and then goes letter ";
        System.out.println("Correct? : " + expected.equals(substring));
    }

    private static void task2() {
        // Дана строка, вырезать подстроку, начиная с символа последнего A, до символа B
        String string = "Some text then goes letter A, I love Java, and A then goes letter B and text";
        int indexOfA = string.lastIndexOf("A");
        int indexOfB = string.indexOf("B");
        String substring = string.substring(indexOfA + 1, indexOfB);
        System.out.println(substring);
        String expected = " then goes letter ";
        System.out.println("Correct? : " + expected.equals(substring));
    }

    private static void task3() {
        // заменить все вхождения символа в позиции 3 на символ стоящий в позиции 0
        // "x: y+x+y+50, calculating: y^2 + 10";
        String data = "x: y+x+y+50, calculating: y^2 + 10";
        // который заменыяем
        Character symbolToReplace = data.charAt(3);
        // которым заменяем
        Character symbolWhichUsedAsReplace = data.charAt(0);
        String result = data.replaceAll(symbolToReplace.toString(), symbolWhichUsedAsReplace.toString());
        System.out.println(result);
    }

    private static void task4() {
        // Дан массив слов, вывести на экран только слова палиндромы
        // aba - пример панидрома
        // 123abc22444422cba321
        // 1-й способ, сложный
        String[] words = {"qwe", "abccba", "aaabbb", "notPolyndrom", "123ABA321"};
        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            boolean isPolyndrom = isPolyndrom(word);
            if (isPolyndrom) {
                System.out.println(word);
            }
        }

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            StringBuilder stringBuilder = new StringBuilder(word);
            String reversedWord = stringBuilder.reverse().toString();
            if (word.equals(reversedWord)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isPolyndrom(String word) {
        if (word.length() == 0) {
            return false;
        }
        for (int i = 0; i < word.length() / 2; ++i) {
            char left = word.charAt(i);
            // i length - 1 - i
            // 0 length - 1 - 0
            // 1 length - 1 - 1
            // 2 length - 1 - 2
            char right = word.charAt(word.length() - 1 - i);
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
