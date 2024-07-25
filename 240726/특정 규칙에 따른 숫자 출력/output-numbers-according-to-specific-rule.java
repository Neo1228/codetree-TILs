import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i = n; i >= 1; i--){
            for(int j = n; j >= 1; j--){
                if(j <= i){
                    System.out.print(cnt + " ");
                    cnt++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}