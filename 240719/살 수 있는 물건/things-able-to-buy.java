import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 3000) {
            System.out.println("book");
        } else if (1000 <= n && n < 3000) {
            System.out.println("mask");
        }
    }
}