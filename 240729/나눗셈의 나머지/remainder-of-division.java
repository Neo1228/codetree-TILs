import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int j = 0;
        for (int i = a; i > 1; i = i / b) {
            j = i % b;
            countArr[j]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            cnt = cnt + countArr[i] * countArr[i];
        }
        System.out.println(cnt);
    }
}