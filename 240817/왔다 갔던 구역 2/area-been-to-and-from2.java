import java.util.Scanner;
public class Main {
    static final int MAX = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[MAX];
        int start = 50;
        for (int i = 0; i < n; i++) {
            int how = sc.nextInt();
            String where = sc.next();
            if (where.equals("R")) {
                for (int j = start; j <= start + how; j++) {
                    arr[j]++;
                }
                start += how;
            } else if (where.equals("L")) {
                for (int j = start; j >= start - how; j--) {
                    arr[j]++;
                }
                start -= how;
            }
        }
        int cnt = 0;
        for (int i = 0; i < MAX; i++) {
            if(arr[i] >= 2 && arr[i + 1] >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}