import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        a = a + 1.5;
        System.out.printf("%.2f", a);
    }
}