import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[11];
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if ((arr[i] / 10) == j) {
                    countArr[j]++;
                }
            }
        }
        for(int i = 10; i >= 1; i--){
            System.out.println(i * 10 + " - " + countArr[i]);
        }
    }
}