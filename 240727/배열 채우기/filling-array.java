import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int cnt = 0;
        for(int i = 0; i <= 9; i++){
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }else {
                cnt++;
            }
        }
        for(int j = cnt - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}