import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int T = sc.nextInt();
        int[] infected = new int[n + 1];
        int[] infectionTime = new int[n + 1];
        int[][] shakes = new int[T][3];
        infected[p] = 1;
        infectionTime[p] = 0;

        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // time
            shakes[i][1] = sc.nextInt(); // x
            shakes[i][2] = sc.nextInt(); // y
        }

        // 시간에 따른 이벤트 정렬
        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));

        // 감염 확산 처리
        for (int i = 0; i < T; i++) {
            int t = shakes[i][0];
            int x = shakes[i][1];
            int y = shakes[i][2];
            
            if (infected[x] == 1 && t - infectionTime[x] <= k) {
                if (infected[y] == 0) {
                    infected[y] = 1;
                    infectionTime[y] = t;
                }
            }
            if (infected[y] == 1 && t - infectionTime[y] <= k) {
                if (infected[x] == 0) {
                    infected[x] = 1;
                    infectionTime[x] = t;
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(infected[i]);
        }
    }
}