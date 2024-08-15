import java.util.Scanner;

public class Main {

    final static int MAX = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = sc.nextInt();
        int[] binary = new int[MAX];
        int num = 0;
        while (true) {
            if (N < 2) {
                binary[num] = N;
                break;
            }
            binary[num++] = N % b;
            N /= b;
        }
        for(int i = num; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }
}