package Lesson2;

public class Lesson_Switch {
    public static void main(String[] args) {
        // кажется не очень удобно и громоздко
        int age = 0;
        if (age < 1) {
            System.out.println("Малютка");
        } else if (age < 18) {
            System.out.println("Подросток");
        } else if (age < 40) {
            System.out.println("Взрослоый человек");
        } else if (age < 80) {
            System.out.println("Старик");
        } else if (age < 85) {

        } else {
            System.out.println("Пора умирать");
        }

        // switch case
        // проверяем месяца, работаем тут с числами
        int month = 3;
        switch (month) { // передаем переменную для проверки
            case 1: {
                System.out.println("Январь"); // дейсвтие которое хотим сделать
                break;
            }
            case 2: {
                System.out.println("Февраль"); // дейсвтие которое хотим сделать
                break;
            }
            case 3: {
                System.out.println("Март"); // дейсвтие которое хотим сделать
                // что будет если не указать break;
                // здесь не стоит break, поэтому выполнение идет дальше
            };
            case 5: {
                System.out.println("Что-то, что напечататься не должно, но напечатается");
                break;
            }
            case 6: {
                System.out.println("Что-то, что не напечатается");
            }
            default: {
                System.out.println("Выполняется, если ничего из условий не подошло");
            }
        }

        // со стринг тоже можно
        String color = "red";
        switch (color) {
            case "red" : {
                System.out.println("Ехать нельзя");
                break;
            }
            case "yellow": {
                System.out.println("Готовься");
                break;
            }
            case "green": {
                System.out.println("Езжай");
                break;
            }
        }

        // Точно можно еще с char ('a'), можно с byte, short, int, Integer и тд
    }
}
