package Lesson4.classesAndEtc;

public class Main {
    public static void main(String[] args) {
        // TODO uncomment
        // имя класса = тип
//        CarExample carExample = new CarExample();
//        // синтаксис доступа к полям / методам класса через точку
//        carExample.color = "red";
//        carExample.doorCount = 1;
//        String color = carExample.color;
//        Integer doorCount = carExample.doorCount;
//
//        carExample.startEngine();
//        carExample.run();
//        carExample.turnOffEngine();
        // Math.max(..)
        /////////////
//        Car car = new Car();
//        car.setDistance(0);
//        car.setName("BWM");
//        System.out.println(car.getDistance());
//        car.run();
//        System.out.println(car.getDistance());
//
//        System.out.println("Before car creation");
//        Car anotherCar = new Car("Ford", "V6");
//        System.out.println("After car creation");
//
//        System.out.println("Car name " + anotherCar.getName());
//        anotherCar.setName("Audi");
//        System.out.println("Car name " + anotherCar.getName());
//        anotherCar.run();
//        anotherCar.run();
//        anotherCar.run();
//        System.out.println(anotherCar.getDistance());

       // myMethod();
        methodReferenceExample();
    }

    private static void myMethod() {
        int a = 5;
        int b = a; // b = a - это не то же самое, что b -> a -> 5 => b = 5;
        System.out.println(a);
        System.out.println(b);
        a = 10;
        System.out.println(a);
        System.out.println(b);

        // переменная car - это ссылка на объект new Car("BMW", "V6");
        Car car = new Car("BMW", "V6");
        Car anotherCar = car; // another -> car (переприсваивание ссылок, НЕ СОЗДАНИЕ КОПИИ объекта)

        System.out.println(car.getName());
        System.out.println(anotherCar.getName());

        car.setName("Audi");
        System.out.println(car.getName());
        System.out.println(anotherCar.getName());

        anotherCar = new Car("Audi", "V8");
        anotherCar.setName("Ford");
        System.out.println(car.getName());
        System.out.println(anotherCar.getName());

        //////////////////
        // boxing, unboxing
        // boxing - из примитива в объект
        // inboxing - из объекта в примитив
        Integer x = 5;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);
        x = 10; // new Integer(10);
        System.out.println(x);
        System.out.println(y);

        Car carExample = new Car("test", "test");
        Car carAnotherExample = carExample;
        System.out.println(carExample);
        System.out.println(carAnotherExample);
        carExample = new Car("test2", "test2");
        System.out.println(carExample);
        System.out.println(carAnotherExample);
    }

    private static void methodReferenceExample() {
        int a = 10;
        System.out.println(a);
        primitiveExample(a);
        System.out.println(a);

        Car car = new Car("NOT TEST", "v6");
        System.out.println(car);
        carObjectReferenceExample(car);
        System.out.println(car);

        Car anotherCar = new Car("NOT TEST", "v6");
        System.out.println(anotherCar);
        carObjectReferenceExample(anotherCar);
        System.out.println(anotherCar);
    }
    // передача по значению
    private static void primitiveExample(int a) {
        a = 15;
        System.out.println(a);
    }

    // передача по ссылке
    private static void carObjectExample(Car car) {
        car.setName("test");
        System.out.println(car);
    }

    // передача по ссылке
    private static void carObjectReferenceExample(Car anotherCar) {
        anotherCar = new Car("anotherTest", "6");
        System.out.println(anotherCar);
    }

}
