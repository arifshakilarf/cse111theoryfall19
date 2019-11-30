package week11.saturday;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        FileWriter out = null;
        Scanner fileReader = null;
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("Take input from file or user?");
            System.out.println("1: File");
            System.out.println("2: User");
            int choice = userInput.nextInt();
            userInput.nextLine(); //Absorb the enter.

            out = new FileWriter("output.txt", true);
            switch(choice) {
                case 1:
                    fileReader = new Scanner(new File("input.txt"));

                    while(fileReader.hasNext()) {
                        out.write(fileReader.nextLine());
                        out.write("\n");
                    }
                    break;
                case 2:
                    System.out.println("Insert Name: ");
                    String name = userInput.nextLine();

                    System.out.println("Insert ID: ");
                    String id = userInput.nextLine();

                    System.out.println("Insert CGPA: ");
                    double cgpa = userInput.nextDouble();

                    out.write(name+","+ id+","+cgpa+"\n");
                    break;
                default:
                    System.out.println("Invalid input");
            }


            if (fileReader != null) {
                fileReader.close();
            }
            if (out != null) {
                out.close();
            }

        }
        catch(Exception e) {

        }
    }
}

