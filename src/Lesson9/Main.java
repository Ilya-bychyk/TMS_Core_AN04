package Lesson9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Вот эти стримы - это не потоки (Threads) И это не потоки которые StreamAPI Java 8
        // Это потоки ввода/вывода
        // Input (in, в) мы получаем (Читаем откуда)
        // Из input можно читать даные
        InputStream is;

        // out (наружу) отдаем, куда-то пишем
        // в output стрим можно данные отдавать (писать)
        OutputStream os;

    }

    private static void fileExamples() throws IOException {
        // Создание по относительному (относительно коревной директории проекта) пути файла
        File testFile = new File("test.txt");
        File fileInDirectory = new File("testDirectory/anotherFile.txt");

        System.out.println(testFile.exists());
        System.out.println(fileInDirectory.exists());

        // Создание по абсолютному пути

        File testfileInDirectoryAbsolute = new File("D:/tms/TMS_Core_AN04/testDirectory/anotherFile.txt");
        System.out.println(testfileInDirectoryAbsolute.exists());

        boolean delete = testFile.delete();
        boolean delete1 = fileInDirectory.delete();
        System.out.println(delete);
        System.out.println(delete1);

        boolean newFile = fileInDirectory.createNewFile();
        System.out.println("Created? " + newFile);
    }

    private static void readFileInputStream() throws Exception {
        InputStream fileInputStream = new FileInputStream("test.txt");
        // читает код символа, если дошел до конца файла, то вернет -1
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.print((char) read);
        }
    }

    private static void writeToFile() throws IOException {
        // Создать файл и напечатать в него что-то
        File file = new File("output.txt");
        // ALT ENTER
        boolean isCreated = file.createNewFile();
        if (!isCreated) {
            throw new IOException("File was not created");
        }
        String text = "I love java.\nAnd I'm writing it to file...\n   \n.";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            fileOutputStream.write(chars[i]);
        }
//        for (int i = 0; i < text.length(); ++i) {
//          fileOutputStream.write(text.charAt(i));
//        }
    }

    private static void readBytesFromFile() throws IOException {
        InputStream fileInputStream = new FileInputStream("test.txt");
        // читает код символа, если дошел до конца файла, то вернет -1
        byte[] array = new byte[6];
        int read;
        while ((read = fileInputStream.read(array)) != -1) {
            System.out.println(new String(array));
        }
//        System.out.println(i);
//        for (int j = 0; j < parts.length; ++j) {
//            if (parts[j] != null) {
//                System.out.print(parts[j]);
//            }
//        }
    }

    private static void writeBytesToFile() throws IOException {
        // Создать файл и напечатать в него что-то
        File file = new File("output.txt");
        // ALT ENTER
        boolean isCreated = file.createNewFile();
        if (!isCreated) {
            throw new IOException("File was not created");
        }
        String text = "I love java.\nAnd I'm writing it to file...\n   \n.";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] textBytes = text.getBytes();
        fileOutputStream.write(textBytes);
    }

    private static void appendText() throws IOException {
        File file = new File("outputTest.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write("!!!!!!!!!!!!!!");
        bufferedWriter.flush();
    }

    private static void buffered() throws IOException {
        // Decorator pattern
        // Читаем / пишем кусками байтов (опитимальнее)
        // stream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"));
        BufferedOutputStream bufferedOutputStream;

        // decorator pattern
        // reader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("text.txt")));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        bufferedWriter.write("Test text\nI love java!\n...\nEnd");
        bufferedWriter.flush();
    }

    private static void tryWithResources() {
        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.txt");
            // читает код символа, если дошел до конца файла, то вернет -1
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            // somehow handle it
            System.out.println("Something went wrong with file");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Something went wrong with file while closing");
                throw new RuntimeException(e);
            }
        }

        // try-with-resources (Java 8+ ??)
        try (InputStream stream = new FileInputStream("test.txt")) {
            fileInputStream = new FileInputStream("test.txt");
            // читает код символа, если дошел до конца файла, то вернет -1
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    private static void serialization() {
        Person person = new Person();
        person.setName("MyName");
        person.setSurname("MySurname");


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Object o = objectInputStream.readObject();
            Person p = (Person) o;
            System.out.println(p.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
