package Assignment06;

import java.util.Scanner;
public class TrackingClass {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String dept1 = "CSE";
        String dept2 = "BBS";
        String dept3 = "MNS";
        System.out.println();
        System.out.println("<==========PLEASE  WRITE  THE  DEPARTMENT  AND  COURSE  NAME  IN  BLOCK  LETTER==========>");
        System.out.println();


        System.out.println("Give Me Name Of The "+dept1+" Student");
        String studentName1 = sc.nextLine();
        System.out.println("Give Me Name Of The "+dept2+" Student");
        String studentName2 = sc.nextLine();
        System.out.println("Give Me Name Of The "+dept3+" Student");
        String studentName3 = sc.nextLine();

        System.out.println("Give Me ID Of " + studentName1);
        int studentId1 = sc.nextInt();
        System.out.println("Give Me ID Of " + studentName2);
        int studentId2 = sc.nextInt();
        System.out.println("Give Me ID Of " + studentName3);
        int studentId3 = sc.nextInt();

        System.out.println("Give Me Present Semester Of " + studentName1);
        int semester1 = sc.nextInt();
        System.out.println("Give Me Present Semester Of " + studentName2);
        int semester2 = sc.nextInt();
        System.out.println("Give Me Present Semester Of " + studentName3);
        int semester3 = sc.nextInt();

        Student s = new CSEstudent();
        Student t = new BBSstudent();
        Student u = new MNSstudent();


        for (int k = 1; k < semester1; k++) {
            System.out.println("=====For Now Give The Information About "+studentName1+"=====");
            System.out.println();
            System.out.println("Give Me Number Of Taken Course In Semester No. " + k);
            int takenCourse1 = sc.nextInt();
            s.update(studentName1, studentId1, semester1, dept1);
            String[] courseArray1 = new String[takenCourse1];

            for (int i = 0; i < takenCourse1; i++) {
                System.out.println("Give Me Course Initial");
                courseArray1[i] = sc.next();
                System.out.println("Give Me Credit In This Course");
                double creditInThisCourse1 = sc.nextDouble();
                System.out.println("Give Me The CGPA Of This Course");
                double cgpainThisCourse1 = sc.nextDouble();
                Student s1 = new CSEstudent(creditInThisCourse1, cgpainThisCourse1);
            }
            s.print(k, courseArray1);
        }
        s.delete();



        for (int k = 1; k < semester2; k++) {
            System.out.println("=====For Now Give The Information About "+studentName2+"=====");
            System.out.println();
            System.out.println("Give Me Number Of Taken Course In Semester No. " + k);
            int takenCourse2 = sc.nextInt();
            t.update(studentName2, studentId2, semester2, dept2);
            String[] courseArray2 = new String[takenCourse2];

            for (int i = 0; i < takenCourse2; i++) {
                System.out.println("Give Me Course Initial");
                courseArray2[i] = sc.next();
                System.out.println("Give Me Credit In This Course");
                double creditInThisCourse2 = sc.nextDouble();
                System.out.println("Give Me The CGPA Of This Course");
                double cgpainThisCourse2 = sc.nextDouble();
                Student t1 = new BBSstudent(creditInThisCourse2, cgpainThisCourse2);
            }
            t.print(k, courseArray2);
        }
        t.delete();



        for (int k = 1; k < semester3; k++) {
            System.out.println("=====For Now Give The Information About "+studentName3+"=====");
            System.out.println();
            System.out.println("Give Me Number Of Taken Course In Semester No. " + k);
            int takenCourse3 = sc.nextInt();
            u.update(studentName3, studentId3, semester3, dept3);
            String[] courseArray3 = new String[takenCourse3];

            for (int i = 0; i < takenCourse3; i++) {
                System.out.println("Give Me Course Initial");
                courseArray3[i] = sc.next();
                System.out.println("Give Me Credit In This Course");
                double creditInThisCourse3 = sc.nextDouble();
                System.out.println("Give Me The CGPA Of This Course");
                double cgpainThisCourse3 = sc.nextDouble();
                Student u1 = new MNSstudent(creditInThisCourse3, cgpainThisCourse3);
            }
            u.print(k, courseArray3);
        }
        u.delete();

        System.out.println();
        System.out.println("Do You Want To Calculate Another Student's Result?????");
        System.out.println();
        System.out.println("If Your Answer Is No Then Type 0 Otherwise Type Any Integer Value");
        int type = sc.nextInt();
        System.out.println();
        if(type==0){
            System.out.println("=====>>>>> Thanks For Your Kindness <<<<<=====");
            System.out.println("<<<<<<<<<< Good Bye >>>>>>>>>>");
        }
        else{
            System.out.println("Please Run The Code Again ;)");
        }
    }
}
