import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++){
            people[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                sum += people[j] * ((j - i + n) % n);
            }
            min = Math.min(min, sum);
            sum = 0;
        }
        System.out.println(min);
    }
}