package week10.thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
//            Scanner in = new Scanner(System.in)
            Scanner in = new Scanner(new File("input.txt"));
            int array[] = new int[in.nextInt()];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = in.nextInt();
//            }
            int j = 0;
            while(in.hasNextInt()) {
                 array[j++] = in.nextInt();
            }
            print(array);
        }
        catch(FileNotFoundException f) {
            System.out.println("File not found");
        }
        catch(ArrayIndexOutOfBoundsException a) {
            System.out.println("Something wrong with the array");
        }
        catch(Exception e) {
            System.out.println("No clue what just happened");
        }
        finally {
            System.out.println("Let me die in peace");
        }
        System.out.println("But somehow I survived");
    }
    public static void print(int[] array) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < array.length+1; i++) {
            System.out.println(array[i]);
        }
    }
}
