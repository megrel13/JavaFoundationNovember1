package oop.practice;

public abstract class Computer {
    private double price;
    private int screenLength;

    public Computer(double price, int screenLength) {
        this.price = price;
        this.screenLength = screenLength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScreenLength() {
        return screenLength;
    }

    public void setScreenLength(int screenLength) {
        this.screenLength = screenLength;
    }
    public abstract void isItCool();
//    {
//        if((price > 1000) && (screenLength > 100)) {
//            System.out.println("Этот компьютер крут!");
//        }
//        else
//            System.out.println("Этот компьютер не крут!");
//    }
}

