import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        double sum = 0;
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i].charAt(0)) {
                cnt++;
                sum += arr[i].length();
            }
        }
        System.out.printf("%d %.2f", cnt, sum / cnt);
    }
}