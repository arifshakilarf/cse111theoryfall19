public class Cat {
    public String color="White";
    public String action="sitting";
    public Cat(){}
    public Cat(String s){
        this.color=s;
    }
    public Cat(String s, String y){
        this.color=y;
        this.action=s;
    }
    public void printCat(){
        System.out.println(this.color+" cat is "+this.action);
    }
    public void changeColor(String s){
        this.color=s;
    }
}
