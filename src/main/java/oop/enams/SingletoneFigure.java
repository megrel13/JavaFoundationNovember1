package oop.enams;

import javax.swing.*;

public class SingletoneFigure {
    private String kindFigure;
    private static SingletoneFigure instance;

    private SingletoneFigure(String kindFigure) {
        this.kindFigure = kindFigure;
    }

    public static SingletoneFigure getInstance() {
        if (instance != null) return instance;

        instance = new SingletoneFigure("Circle");
        return instance;

    }

    public void print(){
        System.out.println("Я самый классный объект!");
    }
}
