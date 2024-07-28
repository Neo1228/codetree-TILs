import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        arr[0] = n;
        arr[1] = n1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + (2 * arr[i - 2]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}