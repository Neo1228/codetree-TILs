import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(true){
            n /= 2;
            if(n == 0) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}