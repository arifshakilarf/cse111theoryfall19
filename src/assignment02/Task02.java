package assignment02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x[] = {1,2,3,4,5,6,7,8,9};
        int y[] = {1,2,3,4,5,6,7,8,9};
        int z[] = {1,1,1,1,1,1,1};
        int result[];

        print(x); // 1 2 3 4 5 6 7 8 9
        print(y); // 1 2 3 4 5 6 7 8 9
        print(z); // 1 1 1 1 1 1 1

        int a[] = copy(x);
        print(a); // 1 2 3 4 5 6 7 8 9
        x[1] = 10;
        print(a); // 1 2 3 4 5 6 7 8 9
        print(x); // 1 10 3 4 5 6 7 8 9

        int b[] = join(x,y);
        print(b); // 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9

        int c[] = join(x,z);
        print(c); // 1 2 3 4 5 6 7 8 9 1 1 1 1 1 1 1

        int d[] = copyRef(x);
        print(b); // 1 2 3 4 5 6 7 8 9
        x[1] = 10;
        print(b); // 1 10 3 4 5 6 7 8 9
        print(x); // 1 10 3 4 5 6 7 8 9
    }
}
