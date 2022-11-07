package demo.flowers;

import demo.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private String color;
    private double price;


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
