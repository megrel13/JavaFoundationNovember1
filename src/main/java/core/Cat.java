package core;

public class Cat extends Animal{
    private String colorEyes = "green";

    public Cat() {};

    public Cat( String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public void sayMeow() {
        System.out.println("I'm Cat. Meeeeooooooowwwwww!");
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }
}
