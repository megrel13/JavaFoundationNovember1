package core;

public class Desk {
    private String color;
    private String material;
    private double length;
    private double width;
    private double high;

    public Desk(String material, double length, double high, double width) {
        this.material = material;
        this.length = length;
        this.high = high;
        this.width = width;
        this.color = "white";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String toString() {
        return "Desk{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", high=" + high +
                '}';
    }

    public double deskVolume() {
        return width * high * length;

    }

    public double maxElement() {
        return Math.max(high, Math.max(length, width));

    }


}
