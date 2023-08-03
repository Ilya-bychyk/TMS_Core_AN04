package Lesson6.lesson.car;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car(); wont work
        Truck truck = new Truck("MAZ");
        truck.run();

        TeslaCar teslaCar = new TeslaCar("TeslaCar");
        teslaCar.run();

        startGame(truck);

        startGame(teslaCar);
    }

    public static void startGame(Car car) {
        System.out.println("Starting car...");
        System.out.println("Drawing location..");
        car.run();
    }
}
