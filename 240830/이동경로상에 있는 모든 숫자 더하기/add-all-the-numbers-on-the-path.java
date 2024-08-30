import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean isSafe(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        int[][] map = new int[n][n];
        int x = n / 2; int y = n / 2;
        int dir = 3;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        int sum = map[x][y];

        for (int i = 0; i < t; i++) {
            if(str.charAt(i) == 'L'){
                dir = (dir - 1 + 4) % 4;
            }else if(str.charAt(i) == 'R'){
                dir = (dir + 1) % 4;
            }else {
                int newX = x + dx[dir], newY = y + dy[dir];
                if (!isSafe(newX, newY)) {
                    continue;
                }
                x += dx[dir];
                y += dy[dir];
                sum += map[x][y];
            }
        }
        System.out.println(sum);
    }
}