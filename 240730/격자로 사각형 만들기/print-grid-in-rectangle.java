import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            arr[i][0] = 1;
            arr[0][i] = 1;
        }
        for(int i = 1; i < n; i++){
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}