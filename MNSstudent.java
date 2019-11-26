package Experiment02;

public class MNSstudent extends Student {
    public MNSstudent(String  name, int ID, int semester, String dept) {
        super(name,ID,semester,dept);
    }

    public MNSstudent(double creditInThisCourse, double cgpainThisCourse) {
        super(creditInThisCourse,cgpainThisCourse);
    }

    public void print(int k, String[] courseArray){
        super.print(k,courseArray);
    }
}
