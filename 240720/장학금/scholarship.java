import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 90 && b >= 95) {
            System.out.println(100000);
        } else if (a >= 90 && b >= 90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }
    }
}