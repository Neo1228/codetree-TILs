import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sumVal = 0;
    int cnt = 0;
    double avgVal = 0;
    for(int i = a; i <= b; i++){
        if(i % 5 == 0 || i % 7 == 0){
            sumVal += i;
            cnt++;
        }
    }
    avgVal = sumVal/(double)cnt;
    System.out.printf("%d %.1f", sumVal, avgVal);
    }
}