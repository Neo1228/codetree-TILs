import java.util.Scanner;

public class Main {
    static final int MAX = 20001;  // 범위를 더 넓게 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[MAX];
        int start = 10000;  // 중심을 기준으로 시작

        // 명령어를 처리하여 위치 배열 업데이트
        for (int i = 0; i < n; i++) {
            int how = sc.nextInt();
            String where = sc.next();
            if (where.equals("R")) {
                for (int j = start + 1; j <= start + how; j++) {  // R: start+1부터 시작
                    arr[j]++;
                }
                start += how;
            } else if (where.equals("L")) {
                for (int j = start - 1; j >= start - how; j--) {  // L: start-1부터 시작
                    arr[j]++;
                }
                start -= how;
            }
        }

        int cnt = 0;

        // 2번 이상 지나간 영역의 크기를 계산
        for (int i = 0; i < MAX; i++) {
            if (arr[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);  // 결과 출력
    }
}