import java.util.Scanner;

public class Main {
    public static int direction = 3;
    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        char[] arr = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt++;
            if(arr[i] == 'L') {
                direction = (direction - 1 + 4) % 4;
            }else if (arr[i] == 'R') {
                direction = (direction + 1) % 4;
            }else {
                x = x + dx[direction];
                y = y + dy[direction];
                if(x == 0 && y == 0) {
                    System.out.println(cnt);
                    return;
                }
            }
        }
        if(cnt > 0) {
            System.out.println(-1);
        }
    }
}