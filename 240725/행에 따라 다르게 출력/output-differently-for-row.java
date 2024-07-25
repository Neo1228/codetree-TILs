import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                if (i % 2 == 1) {
                    num++;
                } else {
                    num += 2;
                }
            }
            System.out.println();
            if (i % 2 == 1 && i < n) {
                num+=1;
            } else if (i % 2 == 0 && i < n) {
                num -= n - 2;
            }
        }
    }
}