import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int dir = 3;
        String str = sc.next();
        char[] turn = str.toCharArray(); 
        for(int i = 0; i < turn.length; i++){
            if(turn[i] == 'L'){
                dir = (dir - 1 + 4) % 4;
            }else if(turn[i] == 'R') {
                dir = (dir + 1) % 4;
            }else {
                x += dx[dir];
                y += dy[dir];
            }
        }
        System.out.println(x + " " + y);
    }
}