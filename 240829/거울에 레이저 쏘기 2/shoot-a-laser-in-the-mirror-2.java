import java.util.Scanner;

public class Main {
    public static int n;
    public static int razor;
    public static int[] dx = new int[]{0, 1, 0, -1}; // 동, 남, 서, 북
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static char[][] map;
    public static int[][] where;

    public static boolean isRight(int x, int y) {
        return (x >= 0 && x < n) && (y >= 0 && y < n);
    }

    public static int getReflection(int x, int y, int dir) {
        int count = 0;

        while(true){
            x += dx[dir];
            y += dy[dir];

            if(!isRight(x,y)){
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
        where = new int[n][n];
        map = new char[n][n];
        int x = 0, y = 0;
        int dir = 0;
        where[x][y] = 1;

        for (int i = 2; i <= n * n; i++) {
            int newX = x + dx[dir], newY = y + dy[dir];
            if (newX == 0 && newY == 0) {
                break;
            }
            if (!isRight(newX, newY) || where[newX][newY] != 0) {
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            where[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int k = 0; k < n; k++) {
                map[i][k] = str.charAt(k);
            }
        }

        razor = sc.nextInt();
        int startX = 0, startY = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(where[i][j] == razor) {
                    startX = i;
                    startY = j;
                }
            }
        }

        int direction = 0;
        if (razor >= 1 && razor <= (4 * n) / 4) {
            direction = 1;
        } else if (razor > (4 * n) / 4 && razor <= (4 * n) / 4 * 2) {
            direction = 2;
        } else if (razor > (4 * n) / 4 * 2 && razor <= (4 * n) / 4 * 3) {
            direction = 3;
        } else if (razor > (4 * n) / 4 * 3 && razor <= (4 * n) / 4 * 4) {
            direction = 0;
        }
        System.out.println(getReflection(startX, startY, direction));
    }
}