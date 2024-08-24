import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 개발자 수
        int k = sc.nextInt(); // 감염 전파 가능한 최대 악수 횟수
        int p = sc.nextInt(); // 최초 감염자
        int T = sc.nextInt(); // 악수 이벤트 수

        int[] infected = new int[n + 1]; // 각 개발자의 감염 여부
        int[] handshakeCount = new int[n + 1]; // 각 개발자의 전염 가능 악수 횟수
        int[] time = new int[T]; // 각 악수 이벤트의 시간
        int[] infectedX = new int[T]; // 각 악수 이벤트에서의 x 개발자
        int[] infectedY = new int[T]; // 각 악수 이벤트에서의 y 개발자

        infected[p] = 1; // 최초 감염자 설정

        // 입력받은 값을 배열에 저장
        for (int i = 0; i < T; i++) {
            time[i] = sc.nextInt(); // 시간 t
            infectedX[i] = sc.nextInt(); // x 개발자
            infectedY[i] = sc.nextInt(); // y 개발자
        }

        // 시간에 따른 이벤트 정렬 (기존 코드 유지)
        for (int i = 0; i < T; i++) {
            int minIndex = i;
            for (int j = i + 1; j < T; j++) {
                if (time[j] < time[minIndex]) {
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
        for (int i = 0; i < T; i++) {
            int x = infectedX[i];
            int y = infectedY[i];

            // x가 감염되어 있고, 전염 가능 악수 횟수가 남아 있는 경우
            if (infected[x] == 1 && handshakeCount[x] < k) {
                infected[y] = 1; // y를 감염시킴
                handshakeCount[x]++; // x의 전염 가능 악수 횟수 증가
            }

            // y가 감염되어 있고, 전염 가능 악수 횟수가 남아 있는 경우
            if (infected[y] == 1 && handshakeCount[y] < k) {
                infected[x] = 1; // x를 감염시킴
                handshakeCount[y]++; // y의 전염 가능 악수 횟수 증가
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(infected[i]);
        }
    }
}