package core;

public class Animal {
    private int countOfLegs = 4;
    private int countOfEyes = 2;
    private int countOfTailes = 1;
    private int countOfEars = 2;
    private int countOfMouths = 1;
    private int countOfNoses = 1;
    private String animalString = "Mammals";

    public Animal() {
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfEyes() {
        return countOfEyes;
    }

    public void setCountOfEyes(int countOfEyes) {
        this.countOfEyes = countOfEyes;
    }

    public int getCountOfTailes() {
        return countOfTailes;
    }

    public void setCountOfTailes(int countOfTailes) {
        this.countOfTailes = countOfTailes;
    }

    public int getCountOfEars() {
        return countOfEars;
    }

    public void setCountOfEars(int countOfEars) {
        this.countOfEars = countOfEars;
    }

    public int getCountOfMouths() {
        return countOfMouths;
    }

    public void setCountOfMouths(int countOfMouths) {
        this.countOfMouths = countOfMouths;
    }

    public int getCountOfNoses() {
        return countOfNoses;
    }

    public void setCountOfNoses(int countOfNoses) {
        this.countOfNoses = countOfNoses;
    }

    public String getAnimalString() {
        return animalString;
    }

    public void setAnimalString(String animalString) {
        this.animalString = animalString;
    }
}
