import java.util.Scanner;

public class Main {
    public static boolean isRange(int x, int y, int rangeX, int rangeY) {
        return (x >= 0 && x < rangeX) && (y >= 0 && y < rangeY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        int[] dx = new int[]{0, 1, 0, -1}; // 동, 남, 서, 북
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0; // 행, 열
        int dir = 0;
        map[x][y] = 1;
        for (int i = 2; i <= n * m; i++) {
            int newX = x + dx[dir], newY = y + dy[dir];
            if (!isRange(newX, newY, n, m) || map[newX][newY] != 0)
                dir = (dir + 1) % 4;
            x += dx[dir];
            y += dy[dir];
            map[x][y] = i;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}