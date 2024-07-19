import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        System.out.printf("%s\n%.2f\n%.2f", c, a ,b);
    }
}