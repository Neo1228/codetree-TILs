import java.util.Scanner;

public class Main {
    public static int m, n;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1 ,0};

    public static boolean isSafe(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] map = new char[n][m];
        int x = 0, y = 0;
        int dir = 0;
        int start = 65;
        map[x][y] = (char) start;
        for(int i = 2; i <= n * m; i++){
            int newX = x + dx[dir], newY = y + dy[dir];
            if(!isSafe(newX, newY) || map[newX][newY] != 0){
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            start++;
            map[x][y] = (char) start;
            if(start == 90){
                start = 65;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}