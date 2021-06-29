package Lesson7;
import Lesson7.Engine;
import Lesson7.FuelTank;

public class Car {

   private Engine engine;
   private FuelTank tank;



    public Car(Engine engine, FuelTank tank) {
        this.engine = engine;
        this.tank = tank;
        }

    public void carTurnOn () {

    try {
        if (tank.fuelInTank()) {
            System.out.println("Fuel available...");
            engine.startEngine(tank);
        } else {
            throw new FuelTankIsEmptyException();
        }
    } catch (FuelTankIsEmptyException e1) {
        System.out.println("Fuel tank is empty...");
        }
        }

    public void carTurnOff () {
        engine.stopEngine();
    }

    public void carRun() {
        try {
            if (tank.openTheFuelTank()) {
                throw new FuelTankIsOpenException();
            }
            engine.startEngine(tank);
        } catch (FuelTankIsOpenException e) {
            System.out.println("** gas tank is opened message");
        } catch (FuelTankIsEmptyException e) {
            System.out.println("** gas tank is empty message");
        }
        try {
            if (engine.isStarted()) {
                System.out.println("Car is running");
                tank.setQuantity(tank.getQuantity() - 1);
                if (tank.getFuelQuantity() == 0) {
                    engine.stopEngine();
                }
            } else {
                throw new EngineIsNotStartedException();
            }
        } catch (EngineIsNotStartedException e) {
            System.out.println("** engine is not started message");
        }

    }


    public FuelTank getTank() {
        return tank;
    }



    public Engine getEngine() {
        return engine;
    }

    public boolean isEngineStarted() {
        return engine.isStarted();
    }

    public void stop() {
        if (engine.isStarted()) {
            System.out.println("Car is stopping");
            engine.stopEngine();
        } else {
            System.out.println("Couldn't stop stopped engine");
        }
    }

    public void tank(int fuel) {
        try {
            engine.stopEngine();
            tank.open();
            if (tank.openTheFuelTank()) {
                tank.addFuel(fuel);
            }
        } finally {
            tank.close();
        }
    }
}