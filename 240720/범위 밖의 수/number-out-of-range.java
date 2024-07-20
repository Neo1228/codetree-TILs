import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 10 || a > 20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}