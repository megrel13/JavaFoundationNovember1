package oop.practice;

public class Acer extends Notebook {
    public Acer(double price, int screenLength) {
        super(price, screenLength);
    }

    @Override
    public void isItCool() {
        if((getPrice() > 1000) && (getScreenLength() > 100)) {
            System.out.println("Этот компьютер крут!");
        }
        else
            System.out.println("Этот компьютер не крут!");
    }

    }
