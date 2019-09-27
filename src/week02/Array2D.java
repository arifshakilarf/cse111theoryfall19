package week02;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int arrayOne[][] = new int[2][2];
        int arrayTwo[][] = new int[2][2];

        takeInput(arrayOne);
        takeInput(arrayTwo);

        print(arrayOne);
        print(arrayTwo);

        int[][] additionResult = add(arrayOne, arrayTwo);

        print(additionResult);
    }

    public static void takeInput(int[][] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = in.nextInt();
            }
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] x, int[][] y) {
        int[][] result = new int[x.length][x[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = x[i][j] + y[i][j];
            }
        }
        return result;
    }
}
