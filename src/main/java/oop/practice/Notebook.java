package oop.practice;

public class Notebook extends Computer {
    public Notebook(double price, int screenLength) {
        super(price, screenLength);
    }

    @Override
    public void isItCool() {
        System.out.println("Ноутбук крутой!");

    }
}
