package oop;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Normal  bottle");
        Bottle bottle = new Bottle(400.00d);
        bottle.printIsItBig();
        System.out.println("Small  bottle");
        Bottle smallBottle = new Bottle(50.00d);
        smallBottle.printIsItBig();
        System.out.println("Big water bottle");
        Bottle bigBottle = new Bottle(600.00d);
        bigBottle.printIsItBig();

        System.out.println("Small beer bottle");

    }
}