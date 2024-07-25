import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            for (int j = b; j > 0; j--) {
                if (j % 2 == 0 && j >= a && j <= b) {
                    System.out.printf("%d * %d = %d", j, i, j * i);
                    if(a < 2){
                        if(j <= b && j > 2)
                        System.out.print(" / ");
                    }else{
                        if(j <= b && j > a){
                            System.out.print(" / ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}