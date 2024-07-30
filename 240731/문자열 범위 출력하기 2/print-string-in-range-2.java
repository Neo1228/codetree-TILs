import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i = str.length() - 1; i >= str.length() - n && i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}