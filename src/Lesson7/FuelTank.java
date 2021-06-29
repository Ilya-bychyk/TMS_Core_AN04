package Lesson7;

public class FuelTank {
    private int maxFuel;
    private int quantity;
    private boolean fuelTankIsOpen;

    public FuelTank(int fuel, int quantity) {
        this.maxFuel = maxFuel;
        this.quantity = quantity;
    }

    public Boolean fuelInTank () {
        if (quantity > 0 ) {
            return true;
        } else {
            return false;
        }
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addFuel(int fuel) {
        try {
            int newQuantity = quantity + fuel;
            if (newQuantity <= maxFuel) {
                quantity = newQuantity;
                System.out.println("Tank is almost full");
            } else {
                throw new GasTankIsFullException();
            }
        } catch (GasTankIsFullException e) {
            System.out.println("fuel tank can not get more fuel");
        }
    }

    public Integer getFuelQuantity () {

        return quantity;

    }
    public boolean openTheFuelTank() {
        return fuelTankIsOpen;
    }
    public void open() {
        this.fuelTankIsOpen = true;
    }

    public void close() {
        this.fuelTankIsOpen = false;
    }


  }
