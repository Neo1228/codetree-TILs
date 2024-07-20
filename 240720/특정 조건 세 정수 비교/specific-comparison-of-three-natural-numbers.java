import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        if (a == min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        if (a == b && a == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}