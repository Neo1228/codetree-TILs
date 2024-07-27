import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            } else {
                cnt++;
            }
        }
        for(int i = cnt; i > cnt - 4; i--){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}