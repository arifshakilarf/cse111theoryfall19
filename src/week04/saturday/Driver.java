package week04.saturday;

public class Driver {
    public static void main(String[] args) {
        BankAccount one = new BankAccount();
        System.out.println(one);

        BankAccount two = new BankAccount();
        System.out.println(two);

        BankAccount three = new BankAccount("A", 25000);
        System.out.println(three);
    }
}
