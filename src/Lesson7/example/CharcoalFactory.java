package Lesson7.example;

import java.util.Random;

public class CharcoalFactory {

    private boolean isWorking;

    public Integer produceEnergy() {
        System.out.println("Producing energy...");
        System.out.println("Pollute environment... (very bad)");
        isWorking = true;
        return new Random().nextInt(101);
    }

    public void stopProducingEnergy() {
        isWorking = false;
        System.out.println("Now I'm eco-friendly factory. I'm just doesn't work :)");
    }

    public boolean isWorking() {
        return isWorking;
    }
}
