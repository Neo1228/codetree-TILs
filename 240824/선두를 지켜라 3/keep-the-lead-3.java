import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // A의 구간 수
        int m = sc.nextInt(); // B의 구간 수
        
        int[] aDistances = new int[100000]; // A의 이동 거리 저장
        int[] bDistances = new int[100000]; // B의 이동 거리 저장
        
        int time1 = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt(); // A의 속도
            int t = sc.nextInt(); // 해당 속도로 이동하는 시간
            for (int j = 0; j < t; j++) {
                aDistances[time1] = aDistances[time1 - 1] + v;
                time1++;
            }
        }
        
        int time2 = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt(); // B의 속도
            int t = sc.nextInt(); // 해당 속도로 이동하는 시간
            for (int j = 0; j < t; j++) {
                bDistances[time2] = bDistances[time2 - 1] + v;
                time2++;
            }
        }
        
        int cnt = 0; // 선두가 바뀐 횟수
        int currentLeader = 0; // 0: 없음, 1: A, 2: B, 3: 동점

        for (int i = 1; i < time1; i++) {
            if (aDistances[i] > bDistances[i]) {
                if (currentLeader != 1) {
                    cnt++;
                    currentLeader = 1;
                }
            } else if (aDistances[i] < bDistances[i]) {
                if (currentLeader != 2) {
                    cnt++;
                    currentLeader = 2;
                }
            } else { // aDistances[i] == bDistances[i]
                if (currentLeader != 3) {
                    cnt++;
                    currentLeader = 3;
                }
            }
        }

        System.out.println(cnt);
    }
}