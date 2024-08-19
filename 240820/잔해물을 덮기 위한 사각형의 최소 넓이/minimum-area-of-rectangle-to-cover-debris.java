import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 직사각형 좌표 입력
        int x1_1 = sc.nextInt();
        int y1_1 = sc.nextInt();
        int x2_1 = sc.nextInt();
        int y2_1 = sc.nextInt();

        // 두 번째 직사각형 좌표 입력
        int x1_2 = sc.nextInt();
        int y1_2 = sc.nextInt();
        int x2_2 = sc.nextInt();
        int y2_2 = sc.nextInt();

        // 겹치는 부분의 범위 계산
        int overlapX1 = Math.max(x1_1, x1_2);
        int overlapY1 = Math.max(y1_1, y1_2);
        int overlapX2 = Math.min(x2_1, x2_2);
        int overlapY2 = Math.min(y2_1, y2_2);

        // 겹치지 않는 부분을 덮는 최소 사각형의 범위 계산
        int remainingX1 = Math.min(x1_1, overlapX1) + 1000;
        int remainingY1 = Math.min(y1_1, overlapY1) + 1000;
        int remainingX2 = Math.max(x2_1, overlapX2) + 1000;
        int remainingY2 = Math.max(y2_1, overlapY2) + 1000;

        // 최소 직사각형의 넓이 계산
        int width = remainingX2 - remainingX1;
        int height = remainingY2 - remainingY1;
        int area = width * height;

        System.out.println(area);
    }
}