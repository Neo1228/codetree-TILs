import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int b = 0;
        int[] arr = new int[n];
        int[] question = new int[q];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < question.length; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                question[i] = sc.nextInt();
                System.out.println(arr[question[i] - 1]);
            } else if (a == 2) {
                question[i] = sc.nextInt();
                int cnt = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == question[i]) {
                        cnt++;
                        System.out.println(j + 1);
                        continue;
                    }
                }
                if(cnt < 1)
                System.out.println(0);
            }else if (a == 3) {
                question[i] = sc.nextInt();
                b = sc.nextInt();
                for (int k = question[i] - 1; k <= b - 1; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}