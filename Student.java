package assignment03;

public class Student {
    public static int numberOfStudents=0;
    private String name = " ";
    public Student() {
        this.name="default name";
        numberOfStudents++;
    }
    public String getName(){
        return this.name;
    }
    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }
}
