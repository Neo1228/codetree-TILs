import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        if (str.length() > str2.length()) {
            System.out.println(str);
        } else {
            System.out.println(str2);
        }
    }
}