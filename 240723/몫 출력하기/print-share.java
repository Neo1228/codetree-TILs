import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        while (cnt < 3) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.println(n / 2);
                    cnt++;
                }
                // 홀수일 경우, 아무 작업도 하지 않고 루프가 다음 입력을 기다립니다.
            } else {
                // 입력이 더 이상 없으면 루프 종료
                break;
            }
        }

        sc.close();
    }
}