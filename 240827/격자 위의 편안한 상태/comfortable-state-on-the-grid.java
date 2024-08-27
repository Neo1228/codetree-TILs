import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int r, c;
    public static int[] dr = new int[]{0, 1, 0, -1}; // 우, 하, 좌, 상
    public static int[] dc = new int[]{1, 0, -1, 0};

    public static boolean isComfortable(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int newR = x + dr[i];
            int newC = y + dc[i];
            if (newR >= 1 && newR <= n && newC >= 1 && newC <= n) {
                cnt++;
            }
        }
        if(cnt == 4){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i < m; i++){
            r = sc.nextInt();
            c = sc.nextInt();
            if(isComfortable(r,c)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}