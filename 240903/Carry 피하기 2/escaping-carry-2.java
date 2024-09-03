import java.util.Scanner;

public class Main {

    public static boolean isCarry(int a, int b, int c) {
        int sum = a + b + c;
        String strSum = Integer.toString(sum);
        int len = strSum.length();
        int n = 10;
        int d = 0, f = 0, g = 0;
        for (int i = 1; i <= len; i++) {
            if(a > 0){
                d = a % n;
                a /= 10;
            }
            if(b > 0) {
                f = b % n;
                b /= 10;
            }
            if(c > 0) {
                g = c % n;
                c /= 10;
            }
            if(d + f + g >= 10) {
                return false;
            }
            d = 0;
            f = 0;
            g = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(isCarry(arr[i], arr[j], arr[k])) {
                        max = Math.max(max, arr[i] + arr[j] + arr[k]);
                        cnt++;
                    }
                }
            }
        }
        if(cnt == 0){
            System.out.println(-1);
        }else {
            System.out.println(max);
        }
    }
}