import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        arr[1] = n;
        arr[0] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if(arr[i] > 100){
                break;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 100){
                System.out.print(arr[i] + " ");
                break;
            }else{
                System.out.print(arr[i] + " ");
            }
        }
    }
}