import java.util.Scanner;

public class Main {
    public static int getInt(char c) {
        if(c == 'R'){
            return 0;
        } else if (c == 'U') {
            return 1;
        } else if (c == 'D') {
            return 2;
        } else {
            return 3;
        }
    }

    public static boolean isRange(int x, int y, int range) {
        return (x >= 1 && x <= range) && (y >= 1 && y <= range);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{1, 0, 0, -1}; // 우, 상, 하, 좌
        int[] dy = new int[]{0, 1, -1, 0};
        int time = sc.nextInt();
        int c = sc.nextInt(), r = sc.nextInt();
        char dir = sc.next().charAt(0);
        int a = getInt(dir);
        for(int i = 0; i < time; i++){
            int newX = r + dx[a], newY = c + dy[a];
            if(!isRange(newX, newY, n)) {
                a = 3 - a;
            } else {
                r = r + dx[a];
                c = c + dy[a];
            }
        }
        System.out.println(c + " " + r);
    }
}