package demo.services;

import demo.items.Item;

public class BasketDecorator extends ItemDecorator {

    static final int FOUR = 4;

    public BasketDecorator(Item item) {
        super(item);
        setDescription("decorated with basket.");
    }

    @Override
    public double price() {
        return FOUR + getPrice();
    }

    @Override
    public double getPrice() {
        return price();
    }
}