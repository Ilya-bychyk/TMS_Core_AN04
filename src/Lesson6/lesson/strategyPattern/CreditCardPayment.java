package Lesson6.lesson.strategyPattern;

public class CreditCardPayment implements PaymentMethodStrategy {
    @Override
    public boolean pay(int amount) {
        System.out.println("Paying with credit card " + amount);
        return true;
    }
}
