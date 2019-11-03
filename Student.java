package assignment04;

import java.util.ArrayList;
public class Student {
    public String name=" ";
    public static int id=-1;
    public String typeOfStudent="Regular Student";
    private int ID=0;
    public static int preUni=0;
    public String university="null";

    public Student(String name){
        this.name=name;
            this.id++;
            ID=id;
    }

    public Student(String name,String typeOfStudent){
        this.name=name;
        preUni=1;
        this.typeOfStudent=typeOfStudent;
        this.id++;
        ID=id;
    }

    ArrayList <Course> course=new ArrayList <Course> ();

    public void addCourse(Course c1, Course c2, Course c3, Course c4){
        course.add(c1);
        course.add(c2);
        course.add(c3);
        course.add(c4);
    }

    public void addCourse(Course c1, Course c2, Course c3){
        course.add(c1);
        course.add(c2);
        course.add(c3);
    }

    public String toString(){
        return "Name: "+this.name+"\n"+"ID: "+this.ID+"\n"+this.typeOfStudent+"\n"+"University: "+this.university+"\n"+"List of Courses: "+course.get(0)+" "+course.get(1)+" "+course.get(2)+" "+course.get(3)+"\n";
    }

    public int getID(){
        return this.ID;
    }

    public boolean isNSU() {
            return true;
    }

    public String getName(){
        return this.name;
    }

    public boolean isPreUni(){
        if(preUni==1){
            return true;
        }
        else{
            return false;
        }
    }

    public void completePreUni() {
        this.preUni=0;
    }
}
