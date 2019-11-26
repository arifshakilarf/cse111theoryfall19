package Experiment02;

import java.util.Scanner;
public class TrackingClass {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("<==========PLEASE  WRITE  THE  DEPARTMENT  AND  COURSE  NAME  IN  BLOCK  LETTER==========>");
        System.out.println();

        System.out.println("Give Me Name Of The Student");
        String studentName = sc.nextLine();
        System.out.println("Give Me ID Of " + studentName);
        int studentId = sc.nextInt();
        System.out.println("Give Me Name Of Department");
        String dept = sc.next();

        if (dept.equals("CSE") || dept.equals("BBS") || dept.equals("MNS")) {
            System.out.println("Give Me Present Semester Of " + studentName);
            int semester = sc.nextInt();
            for (int k = 1; k < semester; k++) {
                System.out.println("Give Me Number Of Taken Course In Semester No. " + k);
                int takenCourse = sc.nextInt();
                if (dept.equals("CSE")) {
                    Student s = new CSEstudent(studentName, studentId, semester, dept);
                    String[] courseArray = new String[takenCourse];
                    for (int i = 0; i < takenCourse; i++) {
                        System.out.println("Give Me Course Name");
                        courseArray[i] = sc.next();
                        System.out.println("Give Me Credit In This Course");
                        double creditInThisCourse = sc.nextDouble();
                        System.out.println("Give Me The CGPA Of This Course");
                        double cgpainThisCourse = sc.nextDouble();
                        Student s1 = new CSEstudent(creditInThisCourse, cgpainThisCourse);
                    }
                    s.print(k, courseArray);
                }
                else if (dept.equals("BBS")) {
                    Student s = new BBSstudent(studentName, studentId, semester, dept);
                    String[] courseArray = new String[takenCourse];
                    for (int i = 0; i < takenCourse; i++) {
                        System.out.println("Give Me Course Name");
                        courseArray[i] = sc.next();
                        System.out.println("Give Me Credit In This Course");
                        double creditInThisCourse = sc.nextDouble();
                        System.out.println("Give Me The CGPA Of This Course");
                        double cgpainThisCourse = sc.nextDouble();
                        Student s1 = new BBSstudent(creditInThisCourse, cgpainThisCourse);
                    }
                    s.print(k, courseArray);
                }
                else {
                    Student s = new MNSstudent(studentName, studentId, semester, dept);
                    String[] courseArray = new String[takenCourse];
                    for (int i = 0; i < takenCourse; i++) {
                        System.out.println("Give Me Course Name");
                        courseArray[i] = sc.next();
                        System.out.println("Give Me Credit In This Course");
                        double creditInThisCourse = sc.nextDouble();
                        System.out.println("Give Me The CGPA Of This Course");
                        double cgpainThisCourse = sc.nextDouble();
                        Student s1 = new MNSstudent(creditInThisCourse, cgpainThisCourse);
                    }
                    s.print(k, courseArray);
                }
            }
            System.out.println("Do You Want To Ask Another Student's Result???????");
            System.out.println();
            System.out.println("If Your Answer Is Yes Then Run The Code Again");
            System.out.println();
            System.out.println("If Your Answer Is No Then........");
            System.out.println(">>>>>>>>>> Good Bye <<<<<<<<<<");
        }
        else {
            System.out.println();
            System.out.println("Sorry!!!!! Nothing Found In Our Memory.........");
            System.out.println();
            System.out.println("[For Your Help]--------We Have Results Of Only The Students Of CSE, BBS & MNS Department");
            System.out.println();
            System.out.println("<<<<<<<<<< Please Try Again >>>>>>>>>>");
        }

    }
}
