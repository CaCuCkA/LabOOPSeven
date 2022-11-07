import demo.payment.CreditCardPaymentStrategy;
import demo.payment.PayPalPaymentStrategy;
import demo.payment.Payments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private Payments creditCardPayment;
    private Payments paypalPayment;
    private double price;

    @BeforeEach
    public void init() {
        creditCardPayment = new CreditCardPaymentStrategy();
        paypalPayment = new PayPalPaymentStrategy();
        price = 120.4;
    }

    @Test
    public void testCreditCardPayment() {
        boolean paidByCard = creditCardPayment.pay(price);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPayment() {
        boolean paidByPayPal = paypalPayment.pay(price);
        assert (paidByPayPal);
    }
}