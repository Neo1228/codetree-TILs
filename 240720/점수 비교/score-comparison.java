import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int math_1 = sc.nextInt();
        int eng_1 = sc.nextInt();
        int math_2 = sc.nextInt();
        int eng_2 = sc.nextInt();
        if (math_1 > math_2 && eng_1 > eng_2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
    }
}