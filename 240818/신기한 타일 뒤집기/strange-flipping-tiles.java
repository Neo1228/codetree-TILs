import java.util.Scanner;

public class Main {
    static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[MAX];
        int start = 500000;

        for (int i = 0; i < n; i++) {
            int how = sc.nextInt();
            String where = sc.next();
            if (where.equals("R")) {
                for (int j = start; j < start + how; j++) {
                    arr[j] = "B";
                }
                start += how - 1;
            } else if (where.equals("L")) {
                for (int j = start; j >= start - how + 1; j--) {
                    arr[j] = "W";
                }
                start -= how - 1;
            }
        }

        int cntB = 0;
        int cntW = 0;

        for(int i = 0; i < MAX; i++) {
            if(arr[i] != null){
                if(arr[i].equals("W")) {
                    cntW++;
                }else if (arr[i].equals("B")){
                    cntB++;
                }
            }
        }
        System.out.print(cntW + " " + cntB);

    }
}