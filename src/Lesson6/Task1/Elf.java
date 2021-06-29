package Lesson6.Task1;

public class Elf extends Warrior {

    public Elf (String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    @Override
    public void killa() {
        String name = "Elf";

        System.out.println(name + " race " + race.getName() + " Will kill you!");
        takeAWeapon(weapon);
        attakingWords();
        attak();
        celebrate();
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
