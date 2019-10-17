package week05.thursday;

public class SecondClass {
    public void printObject() {
//        System.out.println(this);
        this.drinkWater();
    }
    public void drinkWater() {
        System.out.println("Drinking water...");
    }
    public String toString() {
        return "I'm in class";
    }
}
