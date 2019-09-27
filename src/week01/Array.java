package week01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[5];

        //To take input
        System.out.println("Give inputs for the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        //To print the array forward
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //To print the array backward
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //Print only even numbers
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
