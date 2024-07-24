import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i = 0; i < n; i++){
            if(i%2==1){
                for(int j= 0; j < n; j++){
                    System.out.print(cnt);
                    cnt++;
                }
            }else{
                for(int j = n; j > 0; j--){
                    System.out.print(cnt+i);
                    cnt--;
                }
            }
            System.out.println();
        }
    }
}