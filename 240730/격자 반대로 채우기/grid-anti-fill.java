import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            if(n % 2 == 0){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                        arr[j][i] = num++;
                    }
                }else {
                    for(int j = n - 1; j >= 0; j--){
                        arr[j][i] = num++;
                    }
                }
            }else{
                if(i % 2 == 1){
                    for(int j = 0; j < n; j++){
                        arr[j][i] = num++;
                    }
                }else {
                    for(int j = n - 1; j >= 0; j--){
                        arr[j][i] = num++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}