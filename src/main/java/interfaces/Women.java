package interfaces;


public class Women implements Cookable, Washable, Cloneable, Comparable<Women> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Women() {
    }

    public Women(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Women{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void cook() {
        System.out.println("I can cook all from fridge");

    }

    @Override
    public void wash() {
        System.out.println("I wash! I woman!");
    }

    @Override
    public void clean() {
        System.out.println("I will clean all house.");
    }

    @Override
    public int compareTo(Women o) {
        int res = this.getAge() - o.getAge();
        if (res < 0) return -1;
        if (res > 0) return 1;
        return 0;
    }
}
