import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int front = sc.nextInt();
        int back = sc.nextInt();
        System.out.println(front + back);
    }
}