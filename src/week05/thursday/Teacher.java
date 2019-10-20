package week05.thursday;

public class Teacher {
    public String name;
    public String department;
    public Course course[] = new Course[8];
    private int totalCourse = 0;
    public Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public void addCourse(Course course) {
        this.course[totalCourse++] = course;
    }

    public void printDetail() {
        System.out.println("========================");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("List of Courses");
        System.out.println("========================");
        for (int i = 0; i < totalCourse; i++) {
            System.out.println(course[i]);
        }
        System.out.println("========================");
    }
}
