package demo.flowers;

public class Rose extends Flower {
   public Rose(FlowerColor color, double sepalLength, double price) {
       super(color, sepalLength, price);
   }

   @Override
    public double price() {
       return price;
   }
}