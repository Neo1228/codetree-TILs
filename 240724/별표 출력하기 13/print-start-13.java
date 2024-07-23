import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 첫 번째 패턴 출력
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        // 두 번째 패턴 출력
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < i / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}