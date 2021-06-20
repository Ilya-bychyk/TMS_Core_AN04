package Lesson5;

public class Elf extends Warrior {
    public Elf (String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }
    public void  takeAWeapon(Weapon weapon) {
        System.out.println("Elf takes " + weapon.getNameWeapon());
    }
    public void attakingWords() {
        System.out.println("Elf whispers: I'll kill ya");
    }
    public void attak() {
        System.out.println("Elf is attaking!!");
    }
    public void celebrate() {
        System.out.println("Elf takes a minute of silence");
    }
}
