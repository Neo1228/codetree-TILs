import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >= 1){
            System.out.print(n + " ");
            n--;
        }
    }
}