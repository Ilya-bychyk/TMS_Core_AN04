package Lesson6.Task2;



public class SleepBattle implements KillDragon {
    @Override
    public boolean tryToKillDragon(String dragon) {
        return dragon.toString().equals(ConstantDragon.BLACK_DRAGON);
    }
}
