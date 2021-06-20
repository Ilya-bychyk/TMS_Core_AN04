package Lesson5;

public class Ork extends Warrior {
    public Ork (String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }
    public void  takeAWeapon(Weapon weapon) {
        System.out.println("Ork takes " + weapon.getNameWeapon());
    }
    public void attakingWords() {
        System.out.println("Ork shouting SFPVUIWAEPAN!!!!!");
    }
    public void attak() {
        System.out.println("Ork is attaking!!");
    }
    public void celebrate() {
        System.out.println("Ork shouting NFKFGFKLNVSDNDFSNFJ!!");
    }
}
