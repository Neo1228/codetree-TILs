import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.printf("%.1f\n", sum / n);
        if (sum / n >= 4.0) {
            System.out.println("Perfect");
        } else if (sum / n >= 3.0) {
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
    }
}