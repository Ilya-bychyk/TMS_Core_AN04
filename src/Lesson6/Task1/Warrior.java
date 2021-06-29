package Lesson6.Task1;

public abstract class Warrior {
    private final String name;
    public final Race race;
    public final Weapon weapon;

    public Warrior(String name, Race race, Weapon weapon) {
        this.name = name;
        this.race = race;
        this.weapon = weapon;
    }
        public abstract void killa() ;
        public abstract void takeAWeapon(Weapon weapon);
        public abstract void attakingWords();
        public abstract void attak();
        public abstract void celebrate();
    }

