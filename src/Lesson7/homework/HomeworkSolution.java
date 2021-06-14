package Lesson7.homework;

public class HomeworkSolution {
    public static void main(String[] args) {
        fightDragon(new WaterDragonWeapon());
        fightDragon(new MeeleDragonWeapon());
    }

    private static void fightDragon(DragonWeapon dragonWeapon) {
        Dragon dragon = new Dragon(Constants.RED_DRAGON);
        boolean isKilled = dragonWeapon.tryKillDragon(dragon);
        if (isKilled) {
            System.out.println("Congratz, take your gold");
        } else {
            System.out.println("Try another weapon");
        }
    }
}
