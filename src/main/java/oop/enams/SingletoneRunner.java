package oop.enams;

public class SingletoneRunner {
    public static void main(String[] args) {
       SingletoneFigure singletoneFigure = SingletoneFigure.getInstance();
       singletoneFigure.print();

     //  SingletoneFigure singletoneFigure1 = new SingletoneFigure(); < --- ошибка приватный конструктор.

        EnumSingletone.INSTANCE.print();
    }
}
 // задание почитать про енам и синглтон . выучить и понять реализацю синглтона( через енам)
// регулярные выражание почитать и попробовать
// поиграться с методами String
// Разобраться в чем отличие 3-х реализации и понять какая лучше.
