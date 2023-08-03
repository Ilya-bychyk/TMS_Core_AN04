package Lesson4.classesAndEtc;

public class CarExample {
    // описание, что её характеризует
    // Поля
    // Модификатор доступа, тип, имя;
    // В джаве существует 3 модификатора доступа
    // 1) public - говорит о том, что доступ имеется отовсюду
    // 2) private - говорит том, что доступа ВНЕ КЛАССА нет

    // TODO на потом оставим
    // 3) protected
    // 4) Но так же модификатор может отсуствовать
    public String color;
    private String name;
    public Integer doorCount;

    // заводить двигатель, ехать, выключать двигатель

    // Методы

    // модификатор доступа, тип возвращаемого значения, имя метода
    // void - ничего (не путать с null)
    public void startEngine() {
        name = "qweqw";
        System.out.println("Engine starting...");
    }

    public void run() {
        System.out.println("Car is running...");
    }

    public void turnOffEngine() {
        System.out.println("Engine is turned off");
    }
}
