import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int h = 0;
        int b = 0;
        for(int i = 1; i <= n; i++){
            if(i % 12 == 0){
                b++;
            }else if(i % 3 == 0){
                h++;
            }else if(i % 2 == 0){
                c++;
            }
        }
        System.out.print(c + " " + h + " " + b);
    }
}