package Lesson6.lesson.strategyPattern;

public class Main {
    public static void main(String[] args) {
        makePayment(100, "webmoney");
        makePayment(200, "creditCard");


        makePayment(100, new CreditCardPayment());
        makePayment(200, new WebmoneyPayment());
        makePayment(200, new BTCPayment());
    }


    private static void makePayment(int amount, PaymentMethodStrategy paymentMethodStrategy) {
        System.out.println("Making payment for " + 100);
        System.out.println("Making another actions..");
        System.out.println("Request user info");
        boolean isPayed = paymentMethodStrategy.pay(amount);
        System.out.println(isPayed ? "Payment completed" : "Payment can not be processed");
    }

    // S.O.L.I.D. принципы
    // O - Open for extension, closed for modification
    // открыт для расширения, закрыт для модификации
    // bad practice, strategy patter is to be used
    private static void makePayment(int amount, String paymentType) {
        System.out.println("Making payment for " + amount);
        System.out.println("Making another actions..");
        System.out.println("Request user info");
        if (paymentType.equals("webmoney")) {
            System.out.println("Making payment with webmoney " + amount);
        } else if (paymentType.equals("creditCard")) {
            System.out.println("Making payment with card " + amount);
        } else if (paymentType.equals("BTC")) {
            System.out.println("Paying with cryptocurrencies " + amount);
        }// итд
    }
}
