package oop.equals;

import java.util.Objects;

public class Programmist {
    private int age;
    private String name;
    private String programmingLanguage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmist that = (Programmist) o;
        return age == that.age &&
                Objects.equals(name, that.name) &&
                Objects.equals(programmingLanguage, that.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, programmingLanguage);
    }
}
