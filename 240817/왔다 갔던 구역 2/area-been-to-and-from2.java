import java.util.Scanner;

public class Main {
    static final int MAX = 2001;  // 충분한 범위 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[MAX];
        int pos = 1000;  // 중간 위치에서 시작

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String direction = sc.next();
            
            if (direction.equals("R")) {
                for (int j = pos; j < pos + x; j++) {
                    arr[j]++;
                }
                pos += x;
            } else {  // "L"
                for (int j = pos - 1; j >= pos - x; j--) {
                    arr[j]++;
                }
                pos -= x;
            }
        }

        int count = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}