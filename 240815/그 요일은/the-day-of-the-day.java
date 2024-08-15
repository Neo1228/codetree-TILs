import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();
        int[] month_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int elapsedWeek = 1;
        int cnt = 0;
        int idx = 0;
        for(int i = 0; i < weeks.length; i++){
            if(weeks[i].equals(day)){
                idx = i;
                break;
            }
        }

        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            elapsedWeek++;
            if(elapsedWeek == idx){
                cnt++;
            }
            if (d1 > month_of_days[m1]) {
                d1 = 0;
                m1++;
            }
            if (elapsedWeek == 7) {
                elapsedWeek = 0;
            }
        }
        System.out.println(cnt);
    }
}