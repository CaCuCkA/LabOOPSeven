import demo.delivery.DHLDeliveryStrategy;
import demo.delivery.PostDeliveryStrategy;
import demo.flowers.*;
import demo.items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class DeliveryTests {
    private DHLDeliveryStrategy DHLDelivery;
    private PostDeliveryStrategy postDelivery;
    private List<demo.items.Item> deliveryItems;

    @BeforeEach
    public void init() {
        DHLDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();

        deliveryItems = new LinkedList<>();
        deliveryItems.add(new Chamomile(FlowerColor.WHITE, 17, 20));
        deliveryItems.add(new Rose(FlowerColor.RED, 25, 37));
        deliveryItems.add(new FlowerPack(new Chamomile(FlowerColor.BLUE, 19, 30),
                3));
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new Chamomile(FlowerColor.WHITE, 50, 100));
        deliveryItems.add(bucket);
    }

    @Test
    public void testDHLDelivery() {
        List<Item> delivered = DHLDelivery.delivery(deliveryItems);
        assert (delivered instanceof List<?>);
    }

    @Test
    public void testPostDelivery() {
        List<Item> delivered = postDelivery.delivery(deliveryItems);
        assert (delivered instanceof List<?>);
    }
}