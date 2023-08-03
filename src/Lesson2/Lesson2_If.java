package Lesson2;

// никогда не называйте так классы, классы должны называться по нотации camelCase TaskNumberTwo
public class Lesson2_If {

    public static void main(String[] args) {
        //    if (условие) { условие - это boolean: true | false
//        // код, который выполнится, только если условие было true
//    }
//    // например
        if (2 > 0) {
            System.out.println("Правда");
        }

        if (2 < 0) {
            System.out.println("Правда, 2 < 0");
        } else {
            // блок кода который выполняется во всех остальных случаях
            System.out.println("Неправда, 2 не меньше 0");
        }




        int age = 15;
        if (age < 1) {
            System.out.println("Малютка");
        } else if (age < 18) {
            System.out.println("Подросток");
        } else if (age < 40) {
            System.out.println("Взрослоый человек");
        } else {
            System.out.println("Старик");
        }

        // Область видимости переменных
        int number = 5;
        boolean condition = true;
        if (condition) {
            System.out.println(number);
            int variableInBlocIf = 2;
        } else if (condition) {
            int variableInBlocIf = 2;
            // System.out.println(variableInBlocIf); // здесь переменная не доступна
        } else {
            // System.out.println(variableInBlocIf); // здесь переменная не доступна
        }
       // System.out.println(variableInBlocIf); // здесь переменная не доступна


        // пост и пре инкремент / декремент
        int a = 2;
        System.out.println("++a = " + ++a); // ++a, --a, a++, a--
        // ++a то же самое, что a = a + 1;
        // a++ то же самое, что и a = a + 1;
        // для -- аналогично
        int b = 2;
        b = b + 1;
        System.out.println("b = b+ 1 " + b);

        // разница между ++a и a++ (для минуса аналогично)
        int c = 1;
        int result = 10 + ++c;
        System.out.println(result); // будет 12
        System.out.println(c); // будет 2;

        int v = 1;
        int result2 = 10 + v++;
        System.out.println(result2); // 11
        System.out.println(v); // 2

        int x1 = 1;
        int x2 = 2;
        boolean booleanResult = ++x1 < 0 || ++x2 > 0;
        System.out.println(x1); // будет 2?
        System.out.println(x2); // будет 3? или 2?

        int y1 = 1;
        int y2 = 2;
        if (++y1 > 0 || printSomething()) {
            System.out.println(y1 + " " + y2);
        }
    }

    private static boolean printSomething() {
        System.out.println("121341234123");
        return true;
    }
}
