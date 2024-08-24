import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int T = sc.nextInt();
        int[] infected = new int[n + 1]; // 이때 n+1은 n명을 처리하기 위한 배열
        int[] time = new int[T];
        int[] infectedX = new int[T];
        int[] infectedY = new int[T];
        infected[p] = 1; // 최초 감염자 설정

        // 입력받은 값을 배열에 저장
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            time[i] = t;
            infectedX[i] = x;
            infectedY[i] = y;
        }

        // 시간에 따른 이벤트 정렬
        for(int i = 0; i < T; i++){
            int minIndex = i;
            for(int j = i + 1; j < T; j++){
                if(time[j] < time[minIndex]){
                    minIndex = j;
                }
            }
            // 시간, 감염자 X, Y의 순서를 함께 교환
            int temp = time[minIndex];
            int temp1 = infectedX[minIndex];
            int temp2 = infectedY[minIndex];
            time[minIndex] = time[i];
            infectedX[minIndex] = infectedX[i];
            infectedY[minIndex] = infectedY[i];
            time[i] = temp;
            infectedX[i] = temp1;
            infectedY[i] = temp2;
        }

        // 감염 확산 처리
        int times = 0;
        for (int i = 0; i < T; i++) {
            if (i == 0 || time[i] - time[i - 1] < k) {
                if(infected[infectedX[i]] == 1){
                    infected[infectedY[i]] = 1;
                    times++;
                } else if (infected[infectedY[i]] == 0) {
                    infected[infectedX[i]] = 1;
                    times++;
                }
            }
            if(times >= k){
                break;
            }
        }

        // 결과 출력
        for(int i = 1; i <= n; i++) {
            System.out.print(infected[i]);
        }
    }
}