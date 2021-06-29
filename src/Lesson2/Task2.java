                                            package Lesson2;

import java.util.Scanner;

/*
Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите день рождения от 1 до 31: ");
        int day = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите месяц рождения от 1 до 12: ");
        int month = in2.nextInt();
            if (21 < day && day < 31 && month == 3 || 1 < day && day < 21 && month == 4) {
                System.out.println("Знак зодиака - Овен");
                }
            else if (21 <= day && day < 30 && month == 4 || 1 < day && day <= 21 && month == 5) {
                System.out.println("Знак зодиака - Телец");
            }
            else if (21 <= day && day < 31 && month == 5 || 1 < day && day <= 21 && month == 6) {
                System.out.println("Знак зодиака - Близнецы");
            }
            else if (21 <= day && day < 30 && month == 6 || 1 < day && day <= 22 && month == 7) {
                System.out.println("Знак зодиака - Рак");
            }
            else if (23 <= day && day < 31 && month == 7 || 1 < day && day <= 22 && month == 8) {
                System.out.println("Знак зодиака - Лев");
            }
            else if (23 <= day && day < 31 && month == 8 || 1 < day && day <= 23 && month == 9) {
                System.out.println("Знак зодиака - Дева");
            }
            else if (24 <= day && day < 30 && month == 9 || 1 < day && day <= 23 && month == 10) {
                System.out.println("Знак зодиака - Весы");
            }
            else if (24 <= day && day < 31 && month == 10 || 1 < day && day <= 21 && month == 11) {
                System.out.println("Знак зодиака - Скорпион");
            }
            else if (22 <= day && day < 30 && month == 11 || 1 < day && day <= 21 && month == 12) {
                System.out.println("Знак зодиака - Стрелец");
            }
            else if (22 <= day && day < 31 && month == 12 || 1 < day && day <= 19 && month == 1) {
                System.out.println("Знак зодиака - Козерог");
            }
            else if (20 <= day && day < 31 && month == 1 || 1 < day && day <= 18 && month == 2) {
                System.out.println("Знак зодиака - Водолей");
            }
            else if (19 <= day && day < 28 && month == 2 || 1 < day && day <= 20 && month == 3) {
                System.out.println("Знак зодиака - Рыбы");
            }
    }
}
