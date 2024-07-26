import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] arr = new double[8];
        double sum = 0;
        for (int i = 0; i < 8; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.printf("%.1f\n", sum / 8);
    }
}