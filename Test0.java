package assignment03;

public class Test0 {
    public static void main(String [] args){
        Student0 s1 = new Student0("Bob", 1);
        Student0 s2 = new Student0("Tom", 2);
        Student0 s3 = new Student0("Jack", 3);
        Student0 s4 = new Student0("Jill", 4);
        Printer pr = new Printer();
        pr.printDetail(s1);
        pr.printDetail(s2);
        pr.printDetail(s3);
        pr.printDetail(s4);
    }
}
