package demo.services;

import demo.items.Item;

public class RibbonDecorator extends ItemDecorator {
    final static int FORTY = 40;

    public RibbonDecorator(Item item) {
        super(item);
        setDescription("decorated with a ribbon.");
    }

    @Override
    public double price() {
        return FORTY + getPrice();
    }

    @Override
    public double getPrice() {
        return price();
    }
}
