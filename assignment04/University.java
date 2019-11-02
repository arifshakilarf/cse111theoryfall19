package assignment04;

import java.util.ArrayList;
public class University {
    public String name=" ";
    public boolean hasCampus=false;

    public University(String name){
        this.name=name;
    }

    public University(String name, boolean hasCampus){
        this.name=name;
        this.hasCampus=hasCampus;
    }

    ArrayList <Student> addStudent= new ArrayList<Student> ();

    public void add(Student studentZero){
        addStudent.add(studentZero);
    }

    public String toString(){
        return "University{name='"+this.name+"', hasCampus="+this.hasCampus+"}";

    }

    public int totalStudents() {
        return addStudent.size();
    }

    public boolean needCampus() {
        if(this.hasCampus==true) {
            return false;
        }
        else{
            return true;
        }
    }


}
