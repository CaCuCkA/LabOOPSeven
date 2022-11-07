package demo.delivery;

import demo.items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public List<Item> delivery(List<Item> toDeliver) {
        System.out.println("Delivered by post.");
        return toDeliver;
    }
}
