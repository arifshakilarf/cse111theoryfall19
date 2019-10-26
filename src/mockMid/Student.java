package mockMid;

//CODE DOES NOT WORK. DO NOT FOLLOW THIS YET.
public class Student {
    public int applicantID;
    public int studentID;
    public String name;

    public Student(int applicantID, int studentID, String name) {
        this.applicantID = applicantID;
        this.studentID = studentID;
        this.name = name;
    }

    public boolean check(Student c) {
        if(c.applicantID == this.applicantID && this.name.equals(c.name)) {
            return true;
        }
        return false;
    }
    public void identify() {
        System.out.printf("Applicant ID: %d, Student ID: %d, Name: %s\n", applicantID, studentID, name);
    }
    public void match(Student c) {
        if(check(c)) {
            System.out.println("same person");
        }
        else {
            System.out.println("not same person");
        }
    }
    public void set(String name) {
        this.name = name;
    }
    public void set(String name, int id) {
        this.name = name;
        this.studentID = id;
    }
}
