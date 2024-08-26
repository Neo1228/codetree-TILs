import java.util.Scanner;
public class Main {
    public static char c;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static int getInt(char c){
        if(c == 'E'){
            return 0;
        }else if(c == 'S'){
            return 1;
        }else if(c == 'W'){
            return 2;
        }else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int x = 0, y = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int dis = sc.nextInt();
            a = getInt(c);
            for (int j = 0; j < dis; j++) {
                cnt++;
                x += dx[a];
                y += dy[a];
                if (x == 0 && y == 0) {
                    System.out.println(cnt);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}