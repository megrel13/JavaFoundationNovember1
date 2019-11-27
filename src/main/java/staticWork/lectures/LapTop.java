package staticWork.lectures;

public class LapTop {
    static String color = "black";
    private double screensize;
    private String companyName;

    public LapTop(double screensize, String companyName) {
        this.screensize = screensize;
        this.companyName = companyName;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        LapTop.color = color;
    }
}
