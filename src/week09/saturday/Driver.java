package week09.saturday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            while (in.hasNextLine()) { //for(;in.hasNextInt();)
                System.out.println(in.nextLine());
            }
        }
        catch(FileNotFoundException f) {
            System.out.println("File thik kore rakho");
        }
        catch(Exception e) {
            System.out.println("main exception");
        }
        finally {

        }

//        int a[] = {1};
//        try {
//            for (int i = 0; i < a.length + 1; i++) {
//                System.out.println(a[i]);
//            }
//        }
//        catch(ArrayIndexOutOfBoundsException variable) {
//            System.out.println("Index e bhul ase " + variable);
//        }

        System.out.println("Im at the end of the file");
    }

}
