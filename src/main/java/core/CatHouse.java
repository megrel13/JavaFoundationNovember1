package core;


public class CatHouse {
    public static void main(String[] args) {
        System.out.println("barsik");
        Cat barsik = new Cat();
        barsik.sayMeow();

        System.out.println("mufasa");
        Cat mufasa = new Lion(false);
        mufasa.sayMeow();

        System.out.println("I'm killer!");
        Lion killer = new Lion(true);
        killer.killOtherAnimal();
        System.out.println(killer.getColorEyes());
        System.out.println(killer.getCountOfLegs());

    }

}
