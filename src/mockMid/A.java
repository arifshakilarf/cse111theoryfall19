package mockMid;

public class A {
    int x = 1;
    int y = 7;
    int methodA() {
        x = x - y;
        y = y + x;
        System.out.println(x+" "+y);
        return x - y;
    }
    void methodB() {
        int x = 8;
        x = x * y;
        y = y + x;
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.methodA();
        a.x = 3;
        a.methodB();
        b.y = 6;
        b.methodB();
    }
}
