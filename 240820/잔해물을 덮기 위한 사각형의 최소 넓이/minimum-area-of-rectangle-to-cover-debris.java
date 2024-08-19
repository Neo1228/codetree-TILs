import java.util.Scanner;

public class Main {
    public static int MAX = 2000;
    public static int HALF = MAX / 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < 2; i++) {
            int row1 = sc.nextInt();
            row1 += HALF;
            int col1 = sc.nextInt();
            col1 += HALF;
            int row2 = sc.nextInt();
            row2 += HALF;
            int col2 = sc.nextInt();
            col2 += HALF;
            if(i == 0) {
                a = row1;
                b = col1;
                c = row2;
                d = col2;
            }
            for (int j = row1; j < row2; j++) {
                for (int k = col1; k < col2; k++) {
                    arr[j][k] = 1;
                }
            }
            if (i == 1) {
                for (int j = row1; j < row2; j++) {
                    for (int k = col1; k < col2; k++) {
                        arr[j][k] = 2;
                    }
                }
            }
        }

        int max = 0;
        int cnt = 0;
        int realMax = 0;
        for(int i = a; i < c; i++) {
            for(int j = b; j < d; j++) {
                if(arr[i][j] == 1) {
                    cnt++;
                }
                if(max < cnt){
                    max = cnt;
                }
            }
            if(realMax < max) {
                realMax = max;
            }
            cnt = 0;
        }

        int cnt2 = 0;
        int max2 = 0;
        int realMax2 = 0;
        for(int i = b; i < d; i++){
            for(int j = a; j < c; j++) {
                if(arr[j][i] == 1) {
                    cnt2++;
                }
                if (max2 < cnt2) {
                    max2 = cnt2;
                }
            }
            if(realMax2 < max2) {
                realMax2 = max2;
            }
            cnt2 = 0;
        }
        System.out.println(realMax * realMax2);

    }
}