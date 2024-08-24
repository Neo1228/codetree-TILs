import java.util.Scanner;

public class Main {
    public static final int MAX_T = 10000000;
    public static final int HALF = MAX_T / 2;

    public static int n, m;
    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int timeA = HALF;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char v = sc.next().charAt(0);

            if (v == 'R') {
                while (t-- > 0) {
                    posA[timeA] = posA[timeA - 1] + 1;
                    timeA++;
                }
            } else if (v == 'L') {
                while (t-- > 0) {
                    posA[timeA] = posA[timeA - 1] - 1;
                    timeA++;
                }
            }
        }

        int timeB = HALF;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char v = sc.next().charAt(0);

            if (v == 'R') {
                while (t-- > 0) {
                    posB[timeB] = posB[timeB - 1] + 1;
                    timeB++;
                }
            } else if (v == 'L') {
                while (t-- > 0) {
                    posB[timeB] = posB[timeB - 1] - 1;
                    timeB++;
                }
            }
        }

        int cnt = 0;
        for(int i = 1; i < MAX_T; i++) {
            if(posA[i] == posB[i] && posB[i] != 0 && posA[i] != 0){
                if(posA[i - 1] != posB[i - 1]){
                    cnt++;
                }
            }else if(i >= timeA && posB[i] != 0) {
                if(posA[timeA - 1] == posB[i]){
                    cnt++;
                }
            }else if(i >= timeB && posA[i] != 0){
                if(posB[timeB - 1] == posA[i]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}