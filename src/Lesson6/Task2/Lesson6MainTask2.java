package Lesson6.Task2;

import java.util.Random;

/*
Реализуйте небольшую игру.

В игре есть комната с драконом, драконы бывают разные (красные, зеленые и т.д. - какие придумаете :) )
В комнате лежат сокровища, которые мы хотим забрать.
Чтобы забрать сокровища, нужно сначала убить дракона, но убивать разных драконов нужно по-разному
Чтобы убить красного дракона, необходимо либо сражаться дальним боем, либо магией воды
Зеленого дракона поможет убить ближний бой
Победить черного дракона можно только усыпив его
В игре также есть наш персонаж, которого можно вооружить разным видом оружия и отправить сражаться с драконом
в комнату
Если дракона удалось победить, персонаж забирает его богатства и выходит из комнаты
Мы не знаем какого типа дракон будет сидеть в комнате (используйте рандом)
 */
public class Lesson6MainTask2 extends ConstantDragon {

    public static void main(String[] args) {
        fightDragon(new DistantBattle());
        fightDragon(new SleepBattle());
        fightDragon(new CloseBattle());
        fightDragon(new WatterBattle());

    }

    private static void fightDragon (KillDragon killDragon) {
        String[] dragonRandom = new String[]{ConstantDragon.BLACK_DRAGON, ConstantDragon.RED_DRAGON, ConstantDragon.GREEN_DRAGON};
        Random randomInt = new Random();
        int n = randomInt.nextInt(dragonRandom.length);
        System.out.println("Your Enemy is Dragon" + n);
        Dragon newDragon = new Dragon(dragonRandom[n]);
            boolean isDragonKilled = killDragon.tryToKillDragon(dragonRandom[n]);
                if (isDragonKilled) {
                    System.out.println("Dragon is killed! Take your Princess!");
                } else {
                    System.out.println("You should use another weapon!");
                }
    }
    }
