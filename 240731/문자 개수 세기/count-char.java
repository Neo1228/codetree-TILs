import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}