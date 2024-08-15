import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] month_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int elapsedWeek = 2;
        if(m1 > m2 || (m1 == m2 && d1 > d2)){
            while(true){
                if(m1 == m2 && d1 == d2){
                    break;
                }
                d1--;
                elapsedWeek--;
                if(d1 == 0){
                    m1--;
                    d1 = month_of_days[m1];
                }
                if(weeks[elapsedWeek].equals(weeks[0])){
                    elapsedWeek = 7;
                }
            }
            System.out.println(weeks[elapsedWeek]);
            return;
        }
        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            elapsedWeek++;
            if (d1 > month_of_days[m1]) {
                d1 = 1;
                m1++;
            }
            if (weeks[elapsedWeek].equals(weeks[7])) {
                elapsedWeek = 0;
            }
        }
        System.out.println(weeks[elapsedWeek]);
    }
}