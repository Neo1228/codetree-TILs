import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * n);
        if (n < 5) {
            System.out.println("tiny");
        }
    }
}