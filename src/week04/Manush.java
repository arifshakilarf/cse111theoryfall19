package week04;

public class Manush {
    private String name;
    private int age;

    public Manush(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Manush{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
