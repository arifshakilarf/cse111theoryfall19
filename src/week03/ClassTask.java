package week03;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 12, y = 8;
        Help help = new Help();

        //This will print:
        //Hi, your result is: 20
        System.out.println(help.add(x,y));
        double z = 3.0;

        //Hello, addition result: 11.0
//        System.out.println(help.add(z,y));
//
//        //Exactly what do I calculate here?
//        System.out.println(help.calculate(x,y,z));
//
        //Multiplied value is : 96
        help.multiply(x,y);

    }
}
