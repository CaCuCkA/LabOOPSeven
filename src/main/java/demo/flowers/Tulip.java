package demo.flowers;

public class Tulip extends Flower {
    public Tulip(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return getPrice();
    }
}