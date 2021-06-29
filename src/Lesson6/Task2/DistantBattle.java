package Lesson6.Task2;

public class DistantBattle implements KillDragon {

    @Override
    public boolean tryToKillDragon(String dragon) {
        return dragon.toString().equals(ConstantDragon.RED_DRAGON);
    }
}
