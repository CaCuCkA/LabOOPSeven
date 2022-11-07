package demo.services;


import demo.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class ItemDecorator extends Item {
    private Item item;

    public abstract double getPrice();
}