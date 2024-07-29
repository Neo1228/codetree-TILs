import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] A = new int[10];

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        int minVal = A[1] - A[0];

        for (int i = 2; i < n; i++){
            if (minVal > A[i] - A[i - 1]){
                minVal = A[i] - A[i - 1];
            } 
        }

        System.out.print(minVal);
    }
}