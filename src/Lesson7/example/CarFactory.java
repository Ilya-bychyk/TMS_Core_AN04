package Lesson7.example;

public class CarFactory {

    private final CharcoalFactory charcoalFactory;

    public CarFactory(CharcoalFactory charcoalFactory) {
        this.charcoalFactory = charcoalFactory;
    }

    public Car createNewCar(String name, Integer year) throws LackOfEnergyException {
        try {
            Integer energy = charcoalFactory.produceEnergy();
            if (energy < 50) {
                throw new LackOfEnergyException("Produced energy " + energy + " is not enough");
            } else {
                // validate data
                if (name != null && name.length() != 0 && year > 1900) {
                    Car car = new Car(name, year, 0);
                    System.out.println("Car is created");
                    return car;
                } else {
                    throw new IllegalArgumentException("Invalid data, name must not be null and empty, year must be >= 1900");
                }
            }
        } finally {
            charcoalFactory.stopProducingEnergy();
        }
    }
}
