import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int T = sc.nextInt();
        int[] infected = new int[n];
        int[] time = new int[T];
        int[] infectedX = new int[T];
        int[] infectedY = new int[T];
        infected[p] = 1;
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            time[i] = t;
            infectedX[i] = x;
            infectedY[i] = y;
        }
        for(int i = 0; i < T; i++){
            int minIndex = i;
            for(int j = i + 1; j < T; j++){
                if(time[j] < time[minIndex]){
                    minIndex = j;
                }
            }
            int temp = time[minIndex];
            int temp1 = infectedX[minIndex];
            int temp2 = infectedY[minIndex];
            infectedX[minIndex] = infectedX[i];
            infectedY[minIndex] = infectedY[i];
            time[minIndex] = time[i];
            time[i] = temp;
            infectedX[i] = temp1;
            infectedY[i] = temp2;
        }
        int times = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || time[i] - time[i - 1] < k) {
                if(infected[infectedX[i]] == 1 || infected[infectedY[i]] == 1){
                    infected[infectedX[i] - 1] = 1;
                    infected[infectedY[i] - 1] = 1;
                    times++;
                }
            }
            if(times >= k){
                break;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(infected[i]);
        }
    }
}