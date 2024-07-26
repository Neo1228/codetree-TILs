import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= m; i++) {
            int n = sc.nextInt();
            if(n == 1){
                System.out.print(cnt);
            }
            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    cnt++;
                    if (n == 1) {
                        System.out.print(cnt);
                        cnt = 0;
                    }
                } else {
                    n = n * 3 + 1;
                    cnt++;
                    if (n == 1) {
                        System.out.print(cnt);
                        cnt = 0;
                    }
                }
            }
            System.out.println();

        }
    }
}