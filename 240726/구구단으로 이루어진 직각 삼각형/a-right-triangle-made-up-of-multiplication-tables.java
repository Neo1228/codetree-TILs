import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(j <= i){
                    System.out.printf("%d * %d = %d", n - i + 1, j, (n - i + 1) * j);
                    if(j < i){
                        System.out.print(" / ");
                    }
                }
            }
            System.out.println();
        }
    }
}