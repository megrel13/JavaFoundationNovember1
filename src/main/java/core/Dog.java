package core;

public class Dog extends Animal {
    private String dogColor = "goldenWhite";
    private String breedOfDog = "goldenRetriever";

    public Dog() {
    }

    public Dog(int countOfLegs, String dogColor, String breedOfDog) {
        this.dogColor = dogColor;
        this.breedOfDog = breedOfDog;
    }


    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    public void SayGaw() {
        System.out.println("I'm a Dog! Gaaaaaawwwww!!!!");
    }
}
