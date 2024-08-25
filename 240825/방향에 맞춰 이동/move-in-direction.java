import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0, y = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();
            for(int j = 0; j < dis; j++){
                if(dir == 'W'){
                    x += dx[2];
                    y += dy[2];
                }else if (dir == 'S'){
                    x += dx[1];
                    y += dy[1];
                }else if (dir == 'N'){
                    x += dx[3];
                    y += dy[3];
                }else {
                    x += dx[0];
                    y += dy[0];
                }
            }
        }
        System.out.println(x + " " + y);
    }
}