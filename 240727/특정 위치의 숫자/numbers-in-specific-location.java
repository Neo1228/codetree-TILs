import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        sum = sum + arr[2] + arr[4] + arr[9];
        System.out.println(sum);
    }
}