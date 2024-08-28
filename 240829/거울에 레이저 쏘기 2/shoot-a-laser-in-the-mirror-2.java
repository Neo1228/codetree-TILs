import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
    public static int[] dy = {1, 0, -1, 0}; // 동, 남, 서, 북
    public static char[][] map;

    // 격자 내에 있는지 확인하는 함수
    public static boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    // 레이저 반사 횟수를 계산하는 함수
    public static int getReflectionCount(int x, int y, int dir) {
        int count = 0;

        while (true) {
            x += dx[dir];
            y += dy[dir];

            if (!isWithinBounds(x, y)) {
                break;
            }

            if (map[x][y] == '/') {
                dir = (dir + 3) % 4;  // 시계 반대 방향으로 회전
            } else if (map[x][y] == '\\') {
                dir = (dir + 1) % 4;  // 시계 방향으로 회전
            }

            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        int razor = sc.nextInt();
        int startX = 0, startY = 0, dir = 0;

        // 레이저의 시작 위치 및 방향 설정
        if (razor <= n) {
            startX = 0;
            startY = razor - 1;
            dir = 1;  // 아래로
        } else if (razor <= 2 * n) {
            startX = razor - n - 1;
            startY = n - 1;
            dir = 2;  // 왼쪽으로
        } else if (razor <= 3 * n) {
            startX = n - 1;
            startY = 3 * n - razor;
            dir = 3;  // 위로
        } else {
            startX = 4 * n - razor;
            startY = 0;
            dir = 0;  // 오른쪽으로
        }

        int result = getReflectionCount(startX, startY, dir);
        System.out.println(result);
    }
}