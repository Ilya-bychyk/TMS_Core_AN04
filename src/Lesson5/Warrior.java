package Lesson5;

public class Warrior {
    private final String name;
    private final Race race;
    private final Weapon weapon;

    public Warrior(String name, Race race, Weapon weapon) {
        this.name = name;
        this.race = race;
        this.weapon = weapon;
    }
    public void killa() {
        System.out.println(name + " race " + race.getName() + " Will kill you!");
        takeAWeapon(weapon);
        attakingWords();
        attak();
        celebrate();
    }
        public void takeAWeapon(Weapon weapon) {}
        public void attakingWords() {}
        public void attak() {}
        public void celebrate() {}
    }

