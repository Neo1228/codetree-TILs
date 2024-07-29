import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        int[] count = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int benefit = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    benefit = arr[j] - arr[i];
                    count[benefit]++;
                    cnt++;
                }
            }
        }
        if(cnt == 0){
            System.out.println(0);
        }
        int minCount = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] >= 1){
                minCount = i;
                break;
            }
        }
        if (minCount != 0) {
            System.out.println(minCount);
        }
    }
}