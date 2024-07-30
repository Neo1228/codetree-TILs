import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int mx = len1;
        if(mx < len2) mx = len2;
        if(mx < len3) mx = len3;
        int mn = len1;
        if(mn > len2) mn = len2;
        if(mn > len3) mn = len3;

        System.out.print(mx - mn);
    }
}