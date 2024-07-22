import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                continue;
            } else if (n % 2 == 0) {
                System.out.println(n / 2);
            }
        }
    }
}