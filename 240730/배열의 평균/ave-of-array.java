import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        float sum1 = 0;
        for (int i = 0; i < 2; i++) {
            float sum = 0;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                sum1 += arr[i][j];
            }
            System.out.printf("%.1f ", sum/4);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            float sum2 = 0;
            for (int j = 0; j < 2; j++) {
                sum2 += arr[j][i];
            }
            System.out.printf("%.1f ", sum2 / 2);
        }
        System.out.println();
        System.out.printf("%.1f", sum1/8);
    }
}