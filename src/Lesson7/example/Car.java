package Lesson7.example;

public class Car {
    private final String name;
    private final Integer year;
    private final Integer distance;

    public Car(String name, Integer year, Integer distance) {
        this.name = name;
        this.year = year;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public Integer getYear() {
        return year;
    }

    public void run() {
        System.out.println("Car is running...wheee");
    }
}