import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int sumVal = 0;
    int cnt = 0;
    for(int i = 1; i <= 10; i++){
        int n = sc.nextInt();
        if(n >= 0 && n <= 200){
            sumVal += n;
            cnt++;
        }
    }
    double avgVal = sumVal / (double)cnt;
    System.out.printf("%d %.1f", sumVal, avgVal);
    }
}