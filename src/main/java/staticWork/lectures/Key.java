package staticWork.lectures;


public class Key {
    public static void main(String[] args) {
        LapTop hp = new LapTop(14.0, "HP");
        LapTop lenovo = new LapTop(3000.0, "Lenovo");

        System.out.println(hp.getColor());
        hp.setColor("blue");
        System.out.println("After blue:");
        System.out.println("lenovo: " + lenovo.getColor());

        LapTop.color = "purple";
        System.out.println("After purple: ");
        System.out.println("HP: " + hp.getColor());
        System.out.println("Lenovo: " + lenovo.getColor());
    }
}


//посмотреть дефолтную реализщацию в джава 8 в интерфейсе
//доделать домашку старую
//в чем отличии интерфейса асбтрактного класса и класса