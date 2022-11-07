import demo.delivery.DHLDeliveryStrategy;
import demo.delivery.PostDeliveryStrategy;
import demo.flowers.Chamomile;
import demo.flowers.Rose;
import demo.flowers.FlowerColor;
import demo.flowers.FlowerBucket;
import demo.flowers.FlowerPack;
import demo.items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class DeliveryTests {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;
    private List<demo.items.Item> deliveryItems;

    static final double CHAMOMILE_SEPAL_LENGTH_ONE = 17;
    static final double ROSE_SEPAL_LENGTH = 25;
    static final double TULIP_SEPAL_LENGTH = 19;
    static final double CHAMOMILE_SEPAL_LENGTH_TWO = 50;

    static final double CHAMOMILE_PRICE_ONE = 20;
    static final double ROSE_PRICE = 37;
    static final double TULIP_PRICE = 30;
    static final double CHAMOMILE_PRICE_TWO = 100;

    @BeforeEach
    public void init() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();

        deliveryItems = new LinkedList<>();
        deliveryItems.add(new Chamomile(FlowerColor.WHITE, CHAMOMILE_SEPAL_LENGTH_ONE, CHAMOMILE_PRICE_ONE));
        deliveryItems.add(new Rose(FlowerColor.RED, ROSE_SEPAL_LENGTH, ROSE_PRICE));
        deliveryItems.add(new FlowerPack(new Chamomile(FlowerColor.BLUE, TULIP_SEPAL_LENGTH, TULIP_PRICE),
                3));
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new Chamomile(FlowerColor.WHITE, CHAMOMILE_SEPAL_LENGTH_TWO, CHAMOMILE_PRICE_TWO));
        deliveryItems.add(bucket);
    }

    @Test
    public void testDHLDelivery() {
        List<Item> delivered = dhlDelivery.delivery(deliveryItems);
        assert (delivered instanceof List<?>);
    }

    @Test
    public void testPostDelivery() {
        List<Item> delivered = postDelivery.delivery(deliveryItems);
        assert (delivered instanceof List<?>);
    }
}