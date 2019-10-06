package assignment02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x[] = {1,2,3,4,5,6,7,8,9};
        int y[] = {1,2,3,4,5,6,7,8,9};
        int z[] = {1,1,1,1,1,1,1};
        int result[];

        Worker02 w2 = new Worker02();

        print(x); // 1 2 3 4 5 6 7 8 9
        print(y); // 1 2 3 4 5 6 7 8 9
        print(z); // 1 1 1 1 1 1 1

        int a[] = w2.copy(x);
        print(a); // 1 2 3 4 5 6 7 8 9
        x[1] = 10;
        print(a); // 1 2 3 4 5 6 7 8 9
        print(x); // 1 10 3 4 5 6 7 8 9

        int b[] = w2.join(x,y);
        print(b); // 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9

        int c[] = w2.join(x,z);
        print(c); // 1 2 3 4 5 6 7 8 9 1 1 1 1 1 1 1

        int d[] = w2.copyRef(x);
        print(b); // 1 2 3 4 5 6 7 8 9
        x[1] = 10;
        print(b); // 1 10 3 4 5 6 7 8 9
        print(x); // 1 10 3 4 5 6 7 8 9

        int e = w2.add(x[1], y[1]);
        System.out.println(e); // 4

        int f = w2.add(x[x.length-1], z[1]);
        System.out.println(f); // 10
    }
    //You may need to code here


}
