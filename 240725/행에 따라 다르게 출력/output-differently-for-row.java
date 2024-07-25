import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[][] map = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = num;
                if (i % 2 == 0) {
                    num++;
                } else {
                    num += 2;
                }
            }
            if (i % 2 == 0 && i < n - 1) {
                num++;
            } else if (i % 2 != 0 && i < n - 1) {
                num = map[i][n-1] + 1;
            }
        }

        // 맵 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}