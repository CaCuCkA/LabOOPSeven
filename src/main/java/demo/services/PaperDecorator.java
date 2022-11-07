package demo.services;


import demo.items.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
        description = "decorated with paper.";
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    public double getPrice() {
        return price();
    }
}