package demo.payment;

public class PayPalPaymentStrategy implements Payments {
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by PayPal");
        return true;
    }
}

