package oop;

public class Bottle {
    private double milliliters;

    public Bottle(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }

    public void printIsItBig(){
       if ((milliliters - 500.00) > 0) {
           System.out.println("Болшая бутылка");
       } else {
           System.out.println("Маленькая бутылка");
       }
    }
}
