package week11.thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            while(in.hasNext()) {
//                StringTokenizer stringTokenizer = new StringTokenizer(in.nextLine(),",");
//                while(stringTokenizer.hasMoreTokens()) {
//                    System.out.println(stringTokenizer.nextToken());
//                }
                String array[] = in.nextLine().split(",");
            }
        }
        catch(FileNotFoundException f) {

        }
    }
}
