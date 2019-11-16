package week07.saturday;

public class Driver {
    public static void main(String[] args) {
        Gandalf var1 = new Frodo();
//        Frodo varx = new Gandalf();
        Gandalf var2 = new Bilbo();
        Gandalf var3 = new Gandalf();
        Object var4 = new Bilbo();
        Bilbo var5 = new Frodo();
        Object var6 = new Gollum();

//        var1.method1(); //Frodo 1 / Bilbo 1
//        var2.method1(); //Bilbo 1
//        var4.method1(); //CT
//        var6.method1(); //CT
//        var1.method2(); // Gandalf 2 / Frodo 1 / Bilbo 1
//        var3.method2(); // Gandalf 1 / Gandalf 2
//        var4.method2(); //CT
//        var5.method2(); // Gandalf 2 / Frodo 1 / Bilbo 1
//        var6.method2(); //CT
//        ((Frodo)var4).method3(); //RE
//        ((Frodo)var6).method2(); //RE
//        ((Gollum)var1).method3(); //RE
//        ((Gollum)var4).method1(); //RE
//        ((Gandalf)var1).method2(); //Gandalf 2 / Frodo 1 / Bilbo 1
//        ((Frodo)var4).method1();  //RE
//        ((Gollum)var6).method2(); //Gandalf 2 / Gandalf 1
//        ((Gandalf)var2).method1(); // Bilbo 1
//        ((Bilbo)var6).method2(); //RE
//        ((Frodo)var1).method3(); //Frodo 3
//        (var5).method3(); //CT

    }
}
