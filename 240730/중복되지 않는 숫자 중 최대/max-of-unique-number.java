import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(int i = 0; i < n; i++) {
            int currNum = arr[i];
            if(max < currNum){
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if (arr[j] == currNum) {
                        count++;
                    }
                }
                if (count == 1) {
                    max = currNum;
                }
            }
        }
        System.out.println(max);
    }
}