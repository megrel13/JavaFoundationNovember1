package oop.enams;

public enum EnumSingletone {
    INSTANCE;

    public void print() {
        System.out.println("Я самый классный объект!");
    }
}
