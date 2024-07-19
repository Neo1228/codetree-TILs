import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = sc.nextInt();
        int m = sc.nextInt();
        h = h + 1;
        System.out.print(h + ":" + m);
    }
}