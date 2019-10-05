package assignment02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 10;
        int y = 4;

        int a = add(x,y);
        System.out.println(a); //Output: 14

        int b = multiply(x,y);
        System.out.println(b); //Output: 40

        int c = subtract(x,y);
        System.out.println(c); //Output: 6

        int d = subtract(y,x);
        System.out.println(d); //Output: 6

        System.out.println(calculate(x,y,y)); //Output: Result is 10
        System.out.println(calculate(y,x,x)); //Output: Result is 4

    }
}
