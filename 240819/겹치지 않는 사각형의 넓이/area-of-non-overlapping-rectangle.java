import java.util.Scanner;

public class Main {
    public static int MAX = 2000;
    public static int HALF = MAX / 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < N; i++){
            int row1 = sc.nextInt();
            row1 += HALF;
            int col1 = sc.nextInt();
            col1 += HALF;
            int row2 = sc.nextInt();
            row2 += HALF;
            int col2 = sc.nextInt();
            col2 += HALF;
            if(i == 1){
                for(int j = row1; j < row2; j++){
                    for(int k = col1; k < col2; k++){
                        arr[j][k] = 2;
                    }
                }
            }
            for(int j = row1; j < row2; j++){
                for (int k = col1; k < col2; k++){
                    arr[j][k] = 1;
                }
            }
            if(i == 2){
                for(int j = row1; j < row2; j++){
                    for (int k = col1; k < col2; k++){
                        arr[j][k] = 3;
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < MAX; i++){
            for (int j = 0; j < MAX; j++){
                if (arr[i][j] == 1){
                    cnt++;
                }else if(arr[i][j] == 2){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}