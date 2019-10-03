package week03;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student studentOne = new Student();
//        studentOne.name = "Asif";
//        System.out.println(studentOne.name);

        Student studentTwo = new Student();
//
////        studentTwo = studentOne;
////        studentOne = studentTwo;
//        studentTwo.name = studentOne.name;
//        studentTwo.name = "@$!F";
////        System.out.println(studentTwo.name);
//        studentOne.setName("Janina");
//        System.out.println(studentOne.getName());

        System.out.println(studentOne.add(3.0,1));



    }
}
