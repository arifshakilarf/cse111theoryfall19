package Week04;

public class Car {

    //Variables/Properties/Global Variables/Intance Variable
    public String color;
    public String model;
    public Manush owner;

    //Constructor
    public Car() {
        this.color = "black";
        this.model = "default";
    }
    public Car(String color) {
        this.color = color;
        this.model = "default";
    }

    public Car(String color, String model, Manush owner) {
        this.color = color;
        this.model = model;
        this.owner = owner;
    }

    //Method
    public void drive() {
        System.out.println("It's moving");
    }
}
