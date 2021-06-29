package Lesson6.Task1;

import Lesson5.Elf;
import Lesson5.Gnome;
import Lesson5.Ork;
import Lesson5.Race;
import Lesson5.Warrior;
import Lesson5.Weapon;

/*
Перепишите задание с урока 5 так, чтобы родительский класс Warrior был абстрактным
и не реализовывал никакое поведение по умолчанию
 */
public class Lesson6Main {
    public static void main(String[] args) {
        Race elfes = new Race("Elf");
        Weapon bowAndArrows = new Weapon("Bow and Arrows");
        Warrior elf = new Elf("Prist", elfes, bowAndArrows);
        Race gnomes = new Race("Gnome");
        Weapon ax = new Weapon("Big Axe");
        Warrior gnome = new Gnome("Little", gnomes, ax);
        Race orks = new Race("Ork");
        Weapon hammer = new Weapon("Big Hammer");
        Warrior ork = new Ork("King", orks, hammer);

        elf.killa();
        gnome.killa();
        ork.killa();


    }
}
