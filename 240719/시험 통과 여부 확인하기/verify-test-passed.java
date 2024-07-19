import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 80) {
            System.out.println("pass");
        }
        else {
            System.out.print("O more score");
        }
    }
}