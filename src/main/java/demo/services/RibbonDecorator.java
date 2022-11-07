package demo.services;

import demo.items.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
        description = "decorated with a ribbon.";
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public double getPrice() {
        return price();
    }
}
