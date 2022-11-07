package demo.payment;

public class CreditCardPaymentStrategy implements Payments {
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by a credit card.");
        return true;
    }
}
