import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != 0) {
                cnt++;
            }else{
                break;
            }
        }
        for(int i = 0; i < cnt; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
                System.out.print(arr[i] + " ");
            }else{
                arr[i] = arr[i] + 3;
                System.out.print(arr[i] + " ");
            }
        }
    }
}