package interfaces;

public class WashingMachine implements Washable {
    @Override
    public void wash() {
        System.out.println("It's washing machine." +
                "I can clean your clothes than you.");
    }
}
