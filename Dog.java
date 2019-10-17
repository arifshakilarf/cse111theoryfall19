public class Dog {
    private String color="Black";
    public Dog(String c){
        this.color=c;
    }
    public void bark(){
        System.out.println(this.color+" dog is barking");
    }
    public void changeColor(String c){
        this.color=c;
    }
}
