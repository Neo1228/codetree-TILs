import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int cnt = n;
    int sumVal = 0;
    for(int i = 1; i <= n; i++){
        int a = sc.nextInt();
        sumVal += a;
    }
    double avgVal = sumVal / (double)cnt;
    System.out.printf("%d %.1f", sumVal, avgVal);
    }
}