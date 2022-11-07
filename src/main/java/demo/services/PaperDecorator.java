package demo.services;


import demo.items.Item;

public class PaperDecorator extends ItemDecorator {
    static final int THIRTEEN = 13;

    public PaperDecorator(Item item) {
        super(item);
        setDescription("decorated with paper.");
    }

    @Override
    public double price() {
        return THIRTEEN + getPrice();
    }

    @Override
    public double getPrice() {
        return price();
    }
}