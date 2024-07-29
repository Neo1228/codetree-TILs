import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }
        }
        for(int i = 0; i < cnt - 1; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }else{
                minVal = arr[i];
            }
        }
        System.out.println(maxVal + " " + minVal);
    }
}