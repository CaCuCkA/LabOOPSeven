package demo.services;


import demo.items.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    protected Item item;

    public abstract double getPrice();
}