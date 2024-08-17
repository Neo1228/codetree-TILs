import java.util.Scanner;

public class Main {
    static final int MAX = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[MAX];
        int start = 5000; // 중심을 기준으로 시작

        // 명령어를 처리하여 위치 배열 업데이트
        for (int i = 0; i < n; i++) {
            int how = sc.nextInt();
            String where = sc.next();
            if (where.equals("R")) {
                for (int j = start; j < start + how; j++) { // R: start부터 시작
                    arr[j]++;
                }
                start += how;
            } else if (where.equals("L")) {
                for (int j = start - 1; j >= start - how; j--) { // L: start부터 시작
                    arr[j]++;
                }
                start -= how;
            }
        }

        int cnt = 0;
        int segmentLength = 0;
        boolean inSegment = false;

        // 2번 이상 지나간 연속된 영역의 크기를 계산
        for (int i = 0; i < MAX; i++) {
            if (arr[i] >= 2) {
                if (!inSegment) {
                    inSegment = true;  // 새로운 연속 구간 시작
                }
                segmentLength++;  // 구간의 길이 증가
            } else {
                if (inSegment) {
                    cnt += segmentLength;  // 현재까지의 연속 구간 길이 추가
                    segmentLength = 0;  // 구간 길이 초기화
                    inSegment = false;  // 구간 종료
                }
            }
        }

        // 마지막으로 세그먼트가 끝나지 않은 경우 처리
        if (inSegment) {
            cnt += segmentLength;
        }

        System.out.println(cnt); // 결과 출력
    }
}