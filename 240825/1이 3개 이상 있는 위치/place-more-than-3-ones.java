import java.util.Scanner;

public class Main {
    public static boolean isRange(int x, int y, int range) {
        return (x >= 0 && x < range && y >= 0 && y < range);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        
        int howmany = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;
                for(int k = 0; k < 4; k++){
                    int newX = i + dx[k], newY = j + dy[k];
                    if(isRange(newX, newY, n) && map[newX][newY] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    howmany++;
                }
            }
        }
        System.out.println(howmany);
    }
}