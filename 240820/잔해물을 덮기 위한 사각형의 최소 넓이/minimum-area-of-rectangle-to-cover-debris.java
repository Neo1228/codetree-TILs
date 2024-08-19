import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 직사각형 입력
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();

        // 두 번째 직사각형 입력
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();

        // 첫 번째 직사각형에서 두 번째 직사각형을 뺀 후 남은 부분의 너비와 높이 계산
        int width = Math.max(0, Math.max(x1, Math.min(x2, x3)) - Math.max(x1, x3)) +
                Math.max(0, Math.max(x1, x4) - Math.min(x2, x4));
        int height = Math.max(0, Math.max(y1, Math.min(y2, y3)) - Math.max(y1, y3)) +
                Math.max(0, Math.max(y1, y4) - Math.min(y2, y4));

        // 결과 출력
        System.out.println(width * height);

        sc.close();
    }
}