import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
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
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(count[i] >= 1){
                maxCount = i;
                for(int j = 0; j < arr.length; j++){
                    if (count[j] >= 1 && maxCount > i) {
                        maxCount = j;
                    }
                }
            }
        }
        if (maxCount != 0) {
            System.out.println(maxCount);
        }
    }
}