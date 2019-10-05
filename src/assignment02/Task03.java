package assignment02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] x = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] y = {{1,2,3},{4,5,6},{7,8,9}};

        print(x); // Output: {{1,1,1},{2,2,2},{3,3,3}}
        print(y); // Output: {{1,2,3},{4,5,6},{7,8,9}}

        swap(x,y);

        print(x); // Output: {{1,2,3},{4,5,6},{7,8,9}}
        print(y); // Output: {{1,1,1},{2,2,2},{3,3,3}}

        int a[][] = reverse(x);

        print(x); // Output: {{1,2,3},{4,5,6},{7,8,9}}
        print(a); // Output: {{7,8,9},{4,5,6},{1,2,3}}

        int b[][] = join(x,y);

        print(b); // Output: {{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}

    }
}
