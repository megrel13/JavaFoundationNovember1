package interfaces;

import java.util.Arrays;


public class House {
    public static void main(String[] args) {
        Cookable person1 = new Man();
        Cookable person2 = new Women();

        person1.cook();
        person2.cook();

        Washable washable1 = new Women();
        Washable washable2 = new WashingMachine();

        washable1.wash();
        washable2.wash();

        Cleanable cleanable = new Man();
        cleanable.clean();

        Man man = new Man("Vitalik");
        System.out.println("man1: " + man.getName());
        try {
            Man man2 = (Man) man.clone();
            System.out.println("man2: " + man2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //       Women trans = (Women) new Object();

        Man vitalik = new Man("Vitalik", 29);
        Man einar = new Man("Einar", 33);
        Man gosha = new Man("gosha", 25);
        Man daniil = new Man("daniil", 27);
        Man andrey = new Man("andrey", 29);

        Women ulia = new Women("Ulia", 26);
        Women katya = new Women("Katya", 23);
        Women ksenia = new Women("Ksenia", 43);
        Women nina = new Women("Nina", 56);
        Women aliedora = new Women("Aliedora", 21);

        Man[] arrayRealMans = new Man[]{vitalik, einar, gosha, daniil, andrey};
        System.out.println("Мужики: ");
        System.out.println(Arrays.toString(arrayRealMans));
        Arrays.sort(arrayRealMans);
        System.out.println(Arrays.toString(arrayRealMans));

        Women[] arrayRealWomen = new Women[]{ulia, katya, ksenia, nina, aliedora};
        System.out.println("Женщины: ");
        System.out.println(Arrays.toString(arrayRealWomen));
        Arrays.sort(arrayRealWomen);
        System.out.println(Arrays.toString(arrayRealWomen));
    }
}
