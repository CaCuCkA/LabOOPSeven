package demo.order;

import demo.delivery.Delivery;
import demo.items.Item;
import demo.payment.Payments;

import java.util.LinkedList;

public class Order {
    private final LinkedList<Item> items;
    private Payments payment;
    private Delivery delivery;

    public Order() {
        items = new LinkedList<>();
    }

    public void setDeliverStrategy(Delivery delivery) {
        System.out.println(delivery.getClass().getSuperclass().toString()
                + "is being used.");
        this.delivery = delivery;
    }

    public void setPaymentMethod(Payments payment) {
        System.out.println(payment.getClass().getSuperclass().toString()
                + "is being used");
        this.payment = payment;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item i : items) {
            price += i.price();
        }
        return price;
    }

    public void processOrder() {
        boolean paid = payment.pay(calculateTotalPrice());

        if (paid) {
            System.out.println("Payment successful.");
            delivery.delivery(items);
        } else {
            System.out.println("Payment failed");
        }
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }
}
