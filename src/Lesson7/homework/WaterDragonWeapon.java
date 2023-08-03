package Lesson7.homework;

public class WaterDragonWeapon implements DragonWeapon {
    @Override
    public boolean tryKillDragon(Dragon dragon) {
        return dragon.getType().equals(Constants.GREEN_DRAGON);
    }
}
