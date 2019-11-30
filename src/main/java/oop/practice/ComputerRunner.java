package oop.practice;


import java.sql.SQLOutput;

public class ComputerRunner {
    public static void main(String[] args) {

        PC amd = new Amd(70.5, 17);
        Notebook hp = new HP(90.1, 15);
        PC intel = new Intel(140.2, 21);
        Notebook mac = new Mac(120.5, 17);
        Notebook acer = new Acer(120.4, 14);


        System.out.println("Amd: ");
        amd.isItCool();
        System.out.println("HP");
        hp.isItCool();
        System.out.println("Intel");
        intel.isItCool();
        System.out.println("Mac");
        mac.isItCool();
        System.out.println("Acer");
        acer.isItCool();


    }


}
