import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i].charAt(arr[i].length() - 1)) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        if(cnt == 0){
            System.out.println("None");
        }
    }
}