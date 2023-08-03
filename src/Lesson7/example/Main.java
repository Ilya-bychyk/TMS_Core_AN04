package Lesson7.example;

public class Main {
    public static void main(String[] args) {
        CharcoalFactory charcoalFactory = new CharcoalFactory();
        CarFactory carFactory = new CarFactory(charcoalFactory);
        try {
            System.out.println("Trying to create a new car...");
            Car bmw = carFactory.createNewCar(null, 2020);
            bmw.run();
        } catch (LackOfEnergyException e) {
            System.out.println("Lack of energy :( Car is not created");
        } catch (Exception e) {
            System.out.println("Something unexpected happened.. " + e.getMessage());
        }
        String message = charcoalFactory.isWorking()
                ? "We still polluting environment"
                : "We are eco-friendly. We stoped factory";
        System.out.println(message);
    }

    private static void ternarOperator() {
//        String message = charcoalFactory.isWorking()
//                ? "We still polluting environment"
//                : "We are eco-friendly. We stoped factory";
//        System.out.println(message);
//
//
//        if (charcoalFactory.isWorking()) {
//            message = "We still polluting environment";
//        } else {
//            message = "We are eco-friendly. We stoped factory";
//        }
//        System.out.println(message);
//
//        // condition ? value-in-case-of-true : value-in-case-of-false
    }

}
