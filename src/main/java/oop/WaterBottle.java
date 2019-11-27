package oop;

public class WaterBottle extends Bottle {

    public WaterBottle(double milliliters) {
        super(milliliters);
    }

    @Override
    public void printIsItBig() {
        if ((getMilliliters() - 1000.00d) > 0) {
            System.out.println("Большая бутылка");
        }
    }
}

