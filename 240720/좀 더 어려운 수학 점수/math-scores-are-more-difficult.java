import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math_1 = sc.nextInt();
        int Eng_1 = sc.nextInt();
        int math_2 = sc.nextInt();
        int Eng_2 = sc.nextInt();
        if (math_1 > math_2) {
            System.out.println("A");
        }if (math_1 < math_2) {
            System.out.println("B");
        }
        if (math_1 == math_2 && Eng_1 > Eng_2) {
            System.out.println("A");
        }
        if (math_1 == math_2 && Eng_1 < Eng_2) {
            System.out.println("B");
        }

    }
}