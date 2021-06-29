package Lesson7;

public class Engine {

    private boolean engineStart = false;
    private String type;

    public Engine(String type) {
        this.type = type;
    }


    public void startEngine(FuelTank fuelTank) throws FuelTankIsEmptyException {
        if (fuelTank.getQuantity() > 0) {
            engineStart = true;
            System.out.println("Engine is starting...");
        } else {
            throw new FuelTankIsEmptyException();
        }
    }


    public void stopEngine() {
        engineStart = false;
        System.out.println("Engine is stopped...");
    }
    public String getType() {
        return type;
    }

    public boolean isStarted() {
        return engineStart ;
    }


}
