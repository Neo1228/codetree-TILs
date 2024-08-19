import java.util.Scanner;

public class Main {
    public static int MAX = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < N; i++){
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();
            for(int j = row1; j < row2; j++){
                for (int k = col1; k < col2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < MAX; i++){
            for (int j = 0; j < MAX; j++){
                if (arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}