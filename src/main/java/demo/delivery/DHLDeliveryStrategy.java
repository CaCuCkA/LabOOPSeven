package demo.delivery;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public List<demo.items.Item> delivery(List<demo.items.Item> toDeliver) {
        System.out.println("Delivered by DHL.");
        return toDeliver;
    }
}
