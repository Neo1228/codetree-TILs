import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int divisor = 1;
        
        while (n > 1) {
            n /= divisor;
            count++;
            divisor++;
        }
        
        System.out.println(count);
        sc.close();
    }
}