import java.util.Scanner;

public class cse110experiment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d", x, i, x*i);
            if(i!=10) {
                System.out.println();
            }
        }
    }
}