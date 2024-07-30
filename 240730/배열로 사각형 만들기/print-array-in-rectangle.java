import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int[][] arr = new int[5][5];

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if(i == 0){
                    arr[i][j] = 1;
                }
                if(j == 0){
                    arr[i][j] = 1;
                }else if(i > 0 && j > 0){
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }

            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}