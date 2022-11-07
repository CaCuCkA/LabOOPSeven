package demo.flowers;

import demo.items.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

public class FlowerBucket extends Item {
    @Getter
    @Setter
    private final List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new LinkedList<>();
    }

    @Override
    public double price() {
        double price = 0;
        for (Item flower : flowerPacks) {
            price += flower.price();
        }
        return price;
    }

    public Item searchFlower(double price) {
        for (Item flower : flowerPacks) {
            if (price == flower.price()) {
                return flower;
            }
        }
        return null;
    }

    public void addFlowers(List<FlowerPack> flowers) {
        flowerPacks.addAll(flowers);
    }

    public void addFlowers(Flower flower) {
        flowerPacks.add(new FlowerPack(flower, 1));
    }
}
