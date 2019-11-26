package Experiment02;

public class Student{
    public String name=" ";
    public int ID=0;
    public int semester=0;
    public String department=" ";
    public double creditInThisCourse=0.0;
    public double cgpainThisCourse=0.0;
    public static double totalCredit=0.0;
    public static double CGPA=0.0;
    public static double previuosSemesterCGPA=0.0;
    public double semesterCGPA=0.0;
    public double comulativeCGPA=0.0;
    public static double completedCredit=0.0;
    public static double tempCredit=0.0;
    public static double tempCGPA=0.0;

    public Student(String name, int ID, int semester, String dept) {
        this.name=name;
        this.ID=ID;
        this.semester=semester;
        this.department=dept;
    }

    public Student(double creditInThisCourse, double cgpainThisCourse) {
        this.creditInThisCourse=creditInThisCourse;
        this.cgpainThisCourse=cgpainThisCourse;
        this.totalCredit+=creditInThisCourse;
        this.completedCredit+=creditInThisCourse;
        CGPA += result();
    }

    private double result() {
        double x=this.creditInThisCourse*this.cgpainThisCourse;
        return x;
    }

    public void print(int k, String[] courseArray){
        String [] courseArray1=courseArray;
        int x=k;
        if(x<this.semester){
            this.tempCredit = this.totalCredit-this.tempCredit;
            this.tempCGPA = this.CGPA-this.tempCGPA;
        }
        this.semesterCGPA=this.tempCGPA/this.tempCredit;
        this.previuosSemesterCGPA+=this.semesterCGPA;
        System.out.println("=================================================");
        System.out.println("Name              : "+this.name);
        System.out.println("Student ID        : "+this.ID);
        System.out.println("Department        : "+this.department);
        System.out.println("Semester          : "+this.semester);
        System.out.print("Courses           : ");
        for(int p = 0; p < courseArray1.length-1; p++){
            System.out.print(courseArray1[p]+", ");
        }
        System.out.println(courseArray1[courseArray1.length-1]);
        System.out.println("Credits Completed : "+this.completedCredit);
        System.out.println("=================================================");
        for(int m=x;  ; ) {
            System.out.println("=================================================");
            System.out.println("-------Result--------");
            System.out.print("CGPA ==>>  Semester   : ");
            System.out.printf("%.2f",this.semesterCGPA);
            System.out.println();
            this.comulativeCGPA=this.previuosSemesterCGPA/m;
            System.out.print("CGPA ==>>  Comulative : ");
            System.out.printf("%.2f",this.comulativeCGPA);
            System.out.println();
            System.out.println("=================================================");
            System.out.println();
            break;
        }
    }
}
