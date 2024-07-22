import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        while (true) {
            if (n == 1) {
                System.out.println(cnt);
                break;
            }else if (n % 2 == 0) {
                n /= 2;
                cnt++;
            }else if (n % 2 == 1) {
                n = (n * 3) + 1;
                cnt++;
            }
        }
    }
}