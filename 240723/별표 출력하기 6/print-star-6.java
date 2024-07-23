import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j < n - i + 1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i <= n - 2; i++){
            for(int j = 0; j < n - i - 2; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < 3 + (2 * i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}