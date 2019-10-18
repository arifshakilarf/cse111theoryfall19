package assignment03;

public class Teacher {
    private static int i=0;
    public String name=" ";
    public String department=" ";
    public String courseName=" ";
    private Course a[]=new Course[8];

    public Teacher (String name, String department){
        this.name=name;
        this.department=department;
    }
    public void addCourse(Course c){
        a[i]=c;
        i++;
    }
    public void printDetail(){
        System.out.println("========================");
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("List of courses");
        System.out.println("========================");
        for(int j=0;j<a.length;j++){
            if(a[j]!=null)
                System.out.println(a[j].fullName);
        }
        System.out.println("========================");
    }
}
