import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String a = sc.next();
        String x = sc.next();
        String y = sc.next();
        System.out.println(a + "-" + y + "-" + x);
    }
}