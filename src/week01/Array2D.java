package week01;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrayOne[][] = new int[2][2];
        int arrayTwo[][] = new int[2][2];
        
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[0].length; j++) {
                arrayOne[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[0].length; j++) {
                arrayTwo[i][j] = in.nextInt();
            }
        }

        print(arrayOne);
        print(arrayTwo);
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }
}
