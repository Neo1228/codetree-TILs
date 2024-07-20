import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_1 = sc.nextInt();
        String sex_1 = sc.next();
        int age_2 = sc.nextInt();
        String sex_2 = sc.next();
        if ((age_1 >= 19 || age_2 >= 19) && (sex_1.equals("M") || sex_2.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}