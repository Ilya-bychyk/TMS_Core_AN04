package Lesson8;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder(10000);
        // Можно считать, что 10^8 = 100_000_000 операций выполняется за секунду
//        for (int i = 0; i < 10_000_000; ++i) {
//            a.append("a");
//        }
        StringBuilder insert = a.append("Hello, ")
                .append("World")
                .append("!")
                .insert(0, "Giberrish");
        System.out.println(insert);
        insert.delete(0, "Giberrish".length());
        System.out.println(insert);
        System.out.println(a.reverse());

        // { '1', '2', '3', '4', '5' }
        // {  null, null, null, 'r', 'l' ..       '!'                                }

        // Не используйте
        StringBuffer stringBuffer = new StringBuffer();
    }
}
