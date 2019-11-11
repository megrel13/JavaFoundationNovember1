package core;


public class DogHouse {
    public static void main(String[] args) {
        System.out.println("princeGregory");
        Dog princeGregory = new Dog();
        princeGregory.SayGaw();
        System.out.println("Порода собаки: " + princeGregory.getBreedOfDog());
        System.out.println("Окрас собаки: " + princeGregory.getDogColor());
        System.out.println("Количество ног: " + princeGregory.getCountOfLegs());
    }
}
