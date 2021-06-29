package Lesson6.Task2;

import java.util.Objects;

public class WatterBattle implements KillDragon {
    @Override
    public boolean tryToKillDragon(String dragon) {
        return Objects.equals(dragon.toString(), ConstantDragon.RED_DRAGON);
    }
}
