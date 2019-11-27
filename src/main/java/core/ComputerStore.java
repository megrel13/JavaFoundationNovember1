package core;

import oop.practice.Acer;
import oop.practice.Notebook;

public class ComputerStore {
    public static void main(String[] args) {
        Notebook acer = new Acer(300.25, 99);
        acer.isItCool();
    }
}
