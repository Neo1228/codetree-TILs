import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] >= maxVal) {
                maxVal = arr[i];
                arr[i] = 0;
            }
        }
        System.out.print(maxVal + " ");
        int maxVal1 = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] >= maxVal1) {
                maxVal1 = arr[i];
            }
        }
        System.out.print(maxVal1);
    }
}