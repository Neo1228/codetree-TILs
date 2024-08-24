import java.util.Scanner;

public class Main {
    public static int MAX = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[MAX];
        int[] arr1 = new int[MAX];
        int time1 = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                arr[time1] = arr[time1 - 1] + v;
                time1++;
            }
        }
        int time2 = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                arr1[time2] = arr1[time2 - 1] + v;
                time2++;
            }
        }
        int cnt = 0;
        int index = 1;
        for (int i = index; i < MAX; i++) {
            if(arr[i] == arr1[i] && arr[i] != 0 && arr1[i] != 0) {
                cnt++;
            }
            if (arr[index] > arr1[index]) {
                if (arr[i] < arr1[i]) {
                    cnt++;
                    index = i;
                }
            } else if (arr[index] < arr1[index]) {
                if (arr[i] > arr1[i]) {
                    cnt++;
                    index = i;
                }
            } else {
                cnt = 1;
            }
        }
        System.out.println(cnt);
    }
}