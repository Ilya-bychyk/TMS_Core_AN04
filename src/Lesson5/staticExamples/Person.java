package Lesson5.staticExamples;

public class Person {

    public static Integer COUNTER = 0;
    private static Integer ID = 0;

    private Integer id;
    private final String name;
    private String surname;
    private Phone phone;

    public Person(String name) {
        this.name = name;
        this.id = ++ID;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setSurname(String surname) {
        COUNTER++;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    public void callPerson(Person person) {
        System.out.println("Calling from " + phone.getFullNumber() + " to " + person.getPhone().getFullNumber());
    }
}
