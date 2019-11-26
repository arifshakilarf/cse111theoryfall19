package Experiment02;

public class BBSstudent extends Student {
    public BBSstudent(String  name, int ID, int semester, String dept) {
        super(name,ID,semester,dept);
    }

    public BBSstudent(double creditInThisCourse, double cgpainThisCourse) {
        super(creditInThisCourse,cgpainThisCourse);
    }

    public void print(int k, String[] courseArray){
        super.print(k,courseArray);
    }
}
