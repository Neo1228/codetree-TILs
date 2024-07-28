import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < 10; i++) {
            arr[i] = n * (i + 1);
        }
        for(int i = 0; i < 10; i++) {
            if(arr[i] % 5 == 0){
                cnt++;
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] % 5 == 0){
                        cnt++;
                        if(cnt == 2){
                            cnt2 = j;
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 0; i <= cnt2; i++){
            System.out.print(arr[i] + " ");
        }
    }
}