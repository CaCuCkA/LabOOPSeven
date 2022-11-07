package demo.flowers;

import demo.items.Item;
import lombok.Getter;


@Getter
public class Flower extends Item {
    protected double sepalLength;
    protected String color;
    protected double price;


    public Flower(FlowerColor color, double sepalLength, double price) {
        setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    private void setColor(FlowerColor color) {
        this.color = color.toString();
    }
    @Override
    public double price() {
        return price;
    }


}
