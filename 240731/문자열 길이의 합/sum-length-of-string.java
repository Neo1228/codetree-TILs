import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int cnt = 0;
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            cnt += arr[i].length();
            if('a' == arr[i].charAt(0)) {
                cnt1++;
            }
        }
        System.out.println(cnt + " " + cnt1);
    }
}