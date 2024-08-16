import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[300];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < 0){
                a += 100;
            }else if(a > 0){
                a += 100
            }
            if(b < 0){
                b += 100;
            }else if(b > 0){
                b += 100;
            }
            for(int j = a; j <= b - 1; j++){
                arr[j]++;
            }
        }
        int max = arr[0];
        for(int i = 0; i < n + 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}