package Lesson6.lesson.guns;

public class AK47 implements ReloadableGun {

    @Override
    public void reload() {
        System.out.println("Reloading with new mag");
    }

    @Override
    public void shoot() {
        System.out.println("Ta ta ta");
    }
}
