package demo.delivery;

import demo.items.Item;

import java.util.List;

public interface Delivery {
    List<Item> delivery(List<Item> toDeliver);
}
