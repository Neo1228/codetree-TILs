import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int T = sc.nextInt();
        int[] infected = new int[n + 1];
        int[] infectionCount = new int[n + 1];
        int[][] shakes = new int[T][3];
        infected[p] = 1;

        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // time
            shakes[i][1] = sc.nextInt(); // x
            shakes[i][2] = sc.nextInt(); // y
        }

        // 시간에 따른 이벤트 정렬
        for (int i = 0; i < T - 1; i++) {
            for (int j = 0; j < T - i - 1; j++) {
                if (shakes[j][0] > shakes[j + 1][0]) {
                    int[] temp = shakes[j];
                    shakes[j] = shakes[j + 1];
                    shakes[j + 1] = temp;
                }
            }
        }

        // 감염 확산 처리
        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];
            
            if (infected[x] == 1 && infectionCount[x] < k) {
                infected[y] = 1;
                infectionCount[x]++;
            }
            if (infected[y] == 1 && infectionCount[y] < k) {
                infected[x] = 1;
                infectionCount[y]++;
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(infected[i]);
        }
    }
}