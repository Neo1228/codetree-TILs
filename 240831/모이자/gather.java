import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            int diff = 0;
            for (int j = 0; j < n; j++){
                diff += people[j] * Math.abs(j - i);
            }
            min = Math.min(min, diff);
        }
        System.out.println(min);
    }
}