import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dx = new int[]{1, 0, -1, 0}; // 동, 남, 서, 북
    public static int[] dy = new int[]{0, -1, 0, 1};
    public static int[][] map;

    public static boolean isRange(int x, int y) {
        return (x >= 0 && x < n) && (y >= 0 && y < n);
    }

    public static boolean isComfortable(int a, int b){
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int newX = dx[i] + a, newY = dy[i] + b;
            if(isRange(newX, newY) && map[newX][newY] == 1) {
                cnt++;
            }
        }
        if(cnt == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][n];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            map[x][y] = 1;
            if(isComfortable(x, y)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}