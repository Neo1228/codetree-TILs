import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println(sum1 - sum2);
        } else {
            System.out.println(sum2 - sum1);
        }
    }
}