import java.util.Scanner;

public class Main {
    public static int MAX = 2000;
    public static int HALF = MAX / 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[MAX][MAX];
        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 0; i < 2; i++) {
            int row1 = sc.nextInt() + HALF;
            int col1 = sc.nextInt() + HALF;
            int row2 = sc.nextInt() + HALF;
            int col2 = sc.nextInt() + HALF;

            if (i == 0) {
                // 첫 번째 직사각형의 좌표 저장
                a = row1;
                b = col1;
                c = row2;
                d = col2;
            }

            for (int j = row1; j < row2; j++) {
                for (int k = col1; k < col2; k++) {
                    arr[j][k] = i + 1;  // 첫 번째 직사각형은 1로, 두 번째는 2로 표시
                }
            }
        }

        // 남아있는 첫 번째 직사각형의 범위를 찾기 위한 변수
        int minX = MAX, minY = MAX, maxX = 0, maxY = 0;

        for (int i = a; i < c; i++) {
            for (int j = b; j < d; j++) {
                if (arr[i][j] == 1) {  // 첫 번째 직사각형의 잔해물만 포함
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 최소 직사각형의 넓이 계산
        if (minX > maxX || minY > maxY) {
            // 만약 첫 번째 직사각형이 완전히 덮였다면 넓이는 0
            System.out.println(0);
        } else {
            int width = maxX - minX + 1;
            int height = maxY - minY + 1;
            System.out.println(width * height);
        }
    }
}