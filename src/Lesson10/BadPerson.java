package Lesson10;

import java.util.Objects;

public class BadPerson {
    private final String name;
    private final Integer age;

    public BadPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BadPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
