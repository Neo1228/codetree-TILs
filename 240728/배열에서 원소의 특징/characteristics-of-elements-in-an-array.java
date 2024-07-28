import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                System.out.println(arr[i - 1]);
                break;
            }
        }
    }
}