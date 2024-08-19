import java.util.Scanner;

public class Main {
    public static int MAX = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < N; i++){
            int row1 = sc.nextInt();
            row1 += 100;
            int col1 = sc.nextInt();
            col1 += 100;
            int row2 = sc.nextInt();
            row2 += 100;
            int col2 = sc.nextInt();
            col2 += 100;
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