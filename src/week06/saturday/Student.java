package week06.saturday;

public class Student extends Human{
    public String id;
    public String department;

    public Student(String id, String department) {
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
