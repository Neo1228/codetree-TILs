import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[100000];
        int[] arr1 = new int[100000];
        
        int time1 = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                arr[time1] = arr[time1 - 1] + v;
                time1++;
            }
        }
        
        int time2 = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                arr1[time2] = arr1[time2 - 1] + v;
                time2++;
            }
        }
        
        int cnt = 0;
        boolean isCrossing = false;
        
        for (int i = 1; i < Math.min(time1, time2); i++) {
            if (arr[i] == arr1[i]) {
                if (!isCrossing) {
                    cnt++;
                    isCrossing = true;
                }
            } else {
                isCrossing = false;
            }
        }
        
        System.out.println(cnt);
    }
}