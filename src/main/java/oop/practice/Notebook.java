package oop.practice;

public class Notebook extends Computer {
    public Notebook(double price, int screenLength) {
        super(price, screenLength);
    }

    @Override
    public void isItCool() {
        if (getPrice() > 100.00 && getScreenLength() > 15) {
            System.out.println("Ноутбук крутой!");
        } else {
            System.out.println("Ноутбук не крутой!");
        }
    }
}
