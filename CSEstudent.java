package Experiment02;

public class CSEstudent extends Student {
    public CSEstudent(String  name, int ID, int semester, String dept) {
        super(name,ID,semester,dept);
    }

    public CSEstudent(double creditInThisCourse, double cgpainThisCourse) {
        super(creditInThisCourse,cgpainThisCourse);
    }

    public void print(int k, String[] courseArray){
        super.print(k,courseArray);
    }
}
