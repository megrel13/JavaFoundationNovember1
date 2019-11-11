package core;

public class DeskRunner {
    public static void main(String[] args) {  //точка входа в программу
        Desk studentDesk = new Desk("wood", 1.75d, 0.5d, 0.7d);
        System.out.println(studentDesk.getColor());
        System.out.println(studentDesk.toString());
        System.out.println(studentDesk.deskVolume());
        System.out.println(studentDesk.maxElement());
    }
}
