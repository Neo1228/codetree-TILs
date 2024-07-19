import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String temp = s;
        s = t;
        t = temp;
        System.out.println(s + "\n" + t);
    }
}