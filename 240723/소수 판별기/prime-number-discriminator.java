import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        boolean satisfied = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                satisfied = true;
                cnt++;
                if (cnt > 2) {
                    satisfied = false;
                    break;
                }
            }
        }
        if (satisfied) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}