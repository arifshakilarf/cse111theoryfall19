package week04.saturday;

public class BankAccount {
    public static int count = 0;
    private String name;
    private double balance;

    public BankAccount() {
        this.name = "Default Name";
        this.balance = 0.0;
        count++;
    }
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Name: " + this.name + "\nBalance: " + this.balance + "\nTotal Accounts: " + this.count + "\n";
    }
}
