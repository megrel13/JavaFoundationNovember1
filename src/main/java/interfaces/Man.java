package interfaces;

public class Man implements Cookable, Cleanable, Cloneable, Comparable<Man> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void cook() {
        System.out.println("I can cook only eggs");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void clean() {
        System.out.println("Everything is clean!");
    }


    @Override
    public int compareTo(Man o) {
              return this.getName().compareTo(o.getName());
        //    return this.getAge() - o.getAge();
     //   int res = this.getAge() - o.getAge();
     //   if (res < 0) return -1;
     //   if (res > 0) return 1;
     //   return 0;
    }
}

//Hw 1) Реализовать интерйфес Comparable и Cloneable для Woman;
// 2) Создвть Юлию и других женщин добавить в массив и отсортировать.