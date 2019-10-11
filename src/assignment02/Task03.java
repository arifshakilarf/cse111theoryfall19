package assignment02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] x = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] y = {{1,2,3},{4,5,6},{7,8,9}};

        print(x); //{{1,1,1},{2,2,2},{3,3,3}}
        print(y); //{{1,2,3},{4,5,6},{7,8,9}}

        swap(x,y);

        print(x); //{{1,2,3},{4,5,6},{7,8,9}}
        print(y); //{{1,1,1},{2,2,2},{3,3,3}}

        int[][] z = {{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}};

        int a[][] = reverseRow(z);

        print(z); //{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}}
        print(a); //{{7,7,7},{6,6,6},{5,5,5},{4,4,4},{3,3,3},{2,2,2},{1,1,1}};

        int b[][] = join(x,y);

        print(b); //{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}
    }

    //You may need to code here


}
