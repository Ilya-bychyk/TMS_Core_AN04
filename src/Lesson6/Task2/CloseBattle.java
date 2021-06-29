package Lesson6.Task2;

public class CloseBattle implements KillDragon{
    @Override
    public boolean tryToKillDragon(String dragon) {
        return dragon.toString().equals(ConstantDragon.GREEN_DRAGON);
    }
}
