package demo.flowers;

import demo.items.Item;
import lombok.Getter;

@Getter
public class FlowerPack extends Item {
    private final Flower flower;
    private final int quantity;
    private final double price;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
        price = quantity * flower.price();
    }

    @Override
    public double price() {
        return price;
    }
}
