    package assignment03;

    public class Cat {
        public String color = "White";
        public String action = "sitting";
        public Cat(){
        }
        public Cat(String color){
            this.color=color;
        }
        public Cat(String color, String action){
            this.color=action;
            this.action=color;
        }
        public void printCat(){
            System.out.println(this.color+" cat is "+this.action);
        }
        public void changeColor(String color){
            this.color=color;
        }
    }
