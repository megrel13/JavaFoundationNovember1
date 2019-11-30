package oop.practice;

public class PC extends Computer {
    public PC(double price, int screenLength) {
        super(price, screenLength);
    }

    @Override
    public void isItCool() {
        if (getPrice() > 100.00 && getScreenLength() > 15) {
            System.out.println("Компьютер крутой!");
        } else {
            System.out.println("Компьютер не крутой!");
        }
    }

}

