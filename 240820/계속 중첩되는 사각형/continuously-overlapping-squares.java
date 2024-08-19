import java.util.Scanner;

public class Main {
    public static int MAX = 200;
    public static int HALF = MAX / 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[MAX][MAX];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int row1 = sc.nextInt() + HALF;
            int col1 = sc.nextInt() + HALF;
            int row2 = sc.nextInt() + HALF;
            int col2 = sc.nextInt() + HALF;

            for (int j = row1; j < row2; j++) {
                for (int k = col1; k < col2; k++) {
                    arr[j][k] = i + 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j= 0; j < MAX; j++) {
                if(arr[i][j] % 2 == 0 && arr[i][j] != 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}