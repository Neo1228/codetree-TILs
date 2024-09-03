import java.util.Scanner;

public class Main {
    public static int manhattan(int a, int b, int c, int d) {
        return Math.abs(a - c) + Math.abs(b - d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j < str.length() - 1; j++) {
                if (str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
                    if (str.charAt(j) == ')' && str.charAt(j + 1) ==')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}