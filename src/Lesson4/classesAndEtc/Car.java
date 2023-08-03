package Lesson4.classesAndEtc;

public class Car {
    private String engine;
    private String name;
    // при таком присвоении ЛЮБОЙ объект класса Car будет по умолчанию с distance = 0;
    private Integer distance;
    // можно и примитивные типы использовать
    // private int anotherDistance;

    // Конструктор
    // если не указывать явно, то он все равно существует по умолчанию пустой
    // Модификатор доступа, имя класса
    // имя конструктор = имя класса
    public Car() {
        System.out.println("Car() constructor is called");
        this.engine = "";
        this.name = "";
        this.distance = 0;
    }

    public Car(String name, String engine) {
        System.out.println("Car() constructor is called");
        this.engine = engine;
        this.name = name;
        this.distance = 0;
    }

    // модификатор доступа, тип возвращаемого значения, имя
    // get - стандрат
    // getters (гетеры) get + fieldName
    // getEngine
    public String getEngine() {
        return engine;
    }

   public Integer getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    // setters
    // set + fieldName
    public void setDistance(Integer distance) {
        // this - ключевое слово (перевод: этот)
        this.distance = distance;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Car " + name + " is running...");
        distance = distance + 100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
