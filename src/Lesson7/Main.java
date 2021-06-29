package Lesson7;
/*
Берем за основу классы из 4 урока с машинами
Если при попытке поехать у машины не заведен двигатель, выкидываем проверяемое (checked) исключение (написать свой класс исключения)
Если при попытке завести двигатель бензобак пуст, выкидываем проверяемое исключение (написать свой класс исключения)
Реализовать алгоритм дозаправки следующим образом:
Перед заправкой необходимо открыть бензобак
После открытия можно залить бензин
Если залить больше, чем можем вместить бензобак, выкидываем непроверяемое (unchecked) исключение
Предполагаем, что заправка машины это опасная операция и в конце нужно обязательно закрыть бензобак или будет что-то нехорошее
Если машина пытается ехать с открытым безнобаком, пишем на консоль или кидаем исключение сообщающее о катострофе
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 ");
        FuelTank tank = new FuelTank(10, 60);
        Car suzuka = new Car(engine, tank);
        suzuka.carRun();
        suzuka.tank(70);
        suzuka.carRun();
        suzuka.getTank().open();
        suzuka.carRun();
        suzuka.carTurnOff();
    }
}
