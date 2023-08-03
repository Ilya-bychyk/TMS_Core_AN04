package Lesson6.lesson.strategyPattern;

public class WebmoneyPayment implements PaymentMethodStrategy {
    @Override
    public boolean pay(int amount) {
        System.out.println("Pay with webmoney tax " + amount * 1.05);
        return false;
    }
}
