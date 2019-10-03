package week03;

public class Student {
    private String name;
    private int age;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if name has symbols.
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int add(int x, int y) {
        System.out.println("Ami int int");
        return x+y;
    }
    public int add(double x, int y) {
        System.out.println("Ami double int");
        return 0;
    }

}
