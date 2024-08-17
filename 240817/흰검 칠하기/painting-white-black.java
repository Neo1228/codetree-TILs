import java.util.Scanner;

public class Main {
    static final int MAX = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[MAX];
        int[] arrWhite = new int[MAX];
        int[] arrBlack = new int[MAX];
        int start = 5000;

        for (int i = 0; i < n; i++) {
            int how = sc.nextInt();
            String where = sc.next();
            if (where.equals("R")) {
                for (int j = start; j < start + how; j++) {
                    arr[j] = "B";
                    arrBlack[j]++;
                }
                start += how - 1;
            } else if (where.equals("L")) {
                for (int j = start; j >= start - how + 1; j--) {
                    arr[j] = "W";
                    arrWhite[j]++;
                }
                start -= how - 1;
            }
        }

        for(int i = 0; i < MAX; i++) {
            if(arrWhite[i] >= 2 && arrBlack[i] >= 2) {
                arr[i] = "G";
            }
        }

        int cntG = 0;
        int cntB = 0;
        int cntW = 0;

        for(int i = 0; i < MAX; i++) {
            if(arr[i] != null){
                if(arr[i].equals("G")) {
                    cntG++;
                }else if(arr[i].equals("W")) {
                    cntW++;
                }else if(arr[i].equals("B")){
                    cntB++;
                }
            }
        }
        System.out.print(cntW + " " + cntB + " " + cntG);

    }
}