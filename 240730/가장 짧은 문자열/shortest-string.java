import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        if (str.length() > str2.length() && str.length() > str3.length() && str2.length() > str3.length()) {
            System.out.println(str.length() - str3.length());
        } else if (str.length() > str2.length() && str.length() > str3.length() && str3.length() > str2.length()){
            System.out.println(str.length() - str2.length());
        } else if (str2.length() > str.length() && str2.length() > str3.length() && str3.length() > str.length()) {
            System.out.println(str2.length() - str.length());
        } else if (str2.length() > str.length() && str2.length() > str3.length() && str.length() > str3.length()) {
            System.out.println(str2.length() - str3.length());
        }else if(str3.length() > str2.length() && str3.length() > str.length() && str.length() > str2.length()) {
            System.out.println(str3.length() - str2.length());
        }else if(str3.length() > str2.length() && str3.length() > str.length() && str2.length() > str.length()) {
            System.out.println(str3.length() - str.length());
        }
    }
}