import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for(int j = i + 2; j < n; j++){
                sum = Math.max(sum, arr[i] + arr[j]);

            }
        }
        System.out.println(sum);
    }
}