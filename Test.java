public class Test {
    public static void main(String [] args){
    Student2 s1 = new Student2("Bob", 1);
    Student2 s2 = new Student2("Tom", 2);
    Student2 s3 = new Student2("Jack", 3);
    Student2 s4 = new Student2("Jill", 4);
    Printer pr = new Printer();
    pr.printDetail(s1);
    pr.printDetail(s2);
    pr.printDetail(s3);
    pr.printDetail(s4);
}

}
