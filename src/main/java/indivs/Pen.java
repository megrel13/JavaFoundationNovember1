package indivs;

public class Pen {
    static String color;
    private double widthRod;
    private boolean isBallpoint;

    public Pen(double widthRod, boolean isBallpoint) {
        this.widthRod = widthRod;
        this.isBallpoint = isBallpoint;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color + ", " + widthRod + ", " + isBallpoint;
    }
}
