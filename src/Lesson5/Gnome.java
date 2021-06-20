package Lesson5;

public class Gnome extends Warrior {
    public Gnome (String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }
    public void  takeAWeapon(Weapon weapon) {
        System.out.println("Gnome takes " + weapon.getNameWeapon());
    }
    public void attakingWords() {
        System.out.println("Gnome shouting: I'll kill ya!!!");
    }
    public void attak() {
        System.out.println("Gnome is attaking!!");
    }
    public void celebrate() {
        System.out.println("Gnome takes a cup of ale!!");
    }
}
