import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = 0;
        int count = 0;
        int[] N = new int[100];
        for (int i = 0; i < N.length; i++) {
            t = a % 10;
            a = a / 10;
            N[i] = t;
            count++;
            if(a == 0){
                break;
            }
        }

        for(int i = count - 1; i >= 0; i--){
            if(N[i] == 0){
                N[i] = 1;
                break;
            }
        }
        
        if(a == 1){
            System.out.println(0);
            return;
        }

        int num = count - 1;
        int sum = 0;
        int cnt = -1;
        while (true) {
            cnt++;
            if(N[num] == 1){
                sum += (int) Math.pow(2, num);
            }
            num--;
            if (num == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}