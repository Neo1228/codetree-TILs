import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j >= i){
                    System.out.print((char)cnt + " ");
                    cnt++;
                    if(cnt > 'Z'){
                        cnt = 65;
                    }
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}