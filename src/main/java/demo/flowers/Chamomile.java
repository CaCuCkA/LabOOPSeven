package demo.flowers;

public class Chamomile extends Flower {

    public Chamomile(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return getPrice();
    }
}
