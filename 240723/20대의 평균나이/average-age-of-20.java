import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageSum = 0;
        int cnt = 0;
        double avgAge = 0;
        while(true) {
            int age = sc.nextInt();
            if (age >= 20 && age <= 29) {
                ageSum += age;
                cnt++;
                avgAge = (double) ageSum /cnt;
            } else {
                break;
            }
        }
        System.out.printf("%.2f", avgAge);
    }
}