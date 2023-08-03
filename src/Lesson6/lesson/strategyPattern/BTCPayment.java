package Lesson6.lesson.strategyPattern;

public class BTCPayment implements PaymentMethodStrategy {
    @Override
    public boolean pay(int amount) {
        System.out.println("Paying with BTC with tax" + amount * 1.001);
        return true;
    }
}
