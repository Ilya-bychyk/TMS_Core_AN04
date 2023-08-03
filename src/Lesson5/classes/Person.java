package Lesson5.classes;

public class Person {
    // protected - говорит о том, что
    // доступ имеется только в рамках класса и его наследниках
    // а так же в рамках одного пакета
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
