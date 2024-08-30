import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1 ,0};

    public static boolean isSafe(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] map = new int[n][n];
        int x = n - 1; int y = n - 1;
        int dir = 2;
        map[x][y] = n * n;
        for(int i = n * n - 1; i >= 1; i--){
            int newX = x + dx[dir], newY = y + dy[dir];
            if(!isSafe(newX, newY) || map[newX][newY] != 0){
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            map[x][y] = i;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}