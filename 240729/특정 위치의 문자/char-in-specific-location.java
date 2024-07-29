import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int idx = -1;
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                idx = i;
            }
        }
        if(idx == -1){
            System.out.println("None");
        }else{
            System.out.println(idx);
        }

    }
}