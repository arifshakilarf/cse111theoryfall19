public class Account {
    public static double interestRate=5.0;
    public String name="Default Account";
    public double balance;
    public Account(){
    }
    public Account(String s, double x){
        this.name=s;
        this.balance=x;
    }
    public String nameBoshao(String s){
        return this.name=s;
    }
    public double balanceBoshao(double x){
        return this.balance=x;
    }
    public String nameKi(){
        return this.name;
    }
    public double balanceKi(){
        return this.balance;
    }
    public void withdraw(double x){
        double b=this.balance-x;
        if(b<=100){
             System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
        else{
            System.out.println("Withdraw successful! New balance is: "+b);
        }
    }
}
