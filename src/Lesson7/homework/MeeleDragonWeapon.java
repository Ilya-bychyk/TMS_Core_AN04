package Lesson7.homework;

public class MeeleDragonWeapon implements DragonWeapon {
    @Override
    public boolean tryKillDragon(Dragon dragon) {
        return dragon.getType().equals(Constants.RED_DRAGON);
    }
}
