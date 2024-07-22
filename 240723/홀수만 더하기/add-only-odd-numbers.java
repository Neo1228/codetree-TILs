import java.util.Scanner;
public class Main{
    public static void main(Stringp[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumVal = 0;
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            if(a % 2 == 1 && a % 3 ==0){
                sumVal += a;
            }
        }
        System.out.print(sumVal);
    }
}