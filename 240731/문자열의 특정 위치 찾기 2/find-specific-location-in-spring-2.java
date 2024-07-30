import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if(c == arr[i].charAt(3) || c == arr[i].charAt(2)){
                    System.out.println(arr[i]);
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}