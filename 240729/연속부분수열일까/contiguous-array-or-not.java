import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        // 연속 부분 수열인지 확인하는 로직
        boolean found = false;
        
        for (int i = 0; i <= n1 - n2; i++) {
            boolean isSubsequence = true;
            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    isSubsequence = false;
                    break;
                }
            }
            if (isSubsequence) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}