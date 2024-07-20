import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 3 && a <= 5) {
            System.out.println("Spring");
        }if(a >= 6 && a <= 8) {
            System.out.println("Summer");
        }if(a >= 9 && a <= 11) {
            System.out.println("Fall");
        }else {
            System.out.println("Winter");
        }
    }
}