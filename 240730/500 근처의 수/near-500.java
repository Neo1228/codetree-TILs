import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 500){
                min = arr[i];
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] < min && arr[j] > 500){
                        min = arr[j];
                    }
                }
            }if(arr[i] < 500){
                max = arr[i];
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] > max && arr[j] < 500){
                        max = arr[j];
                    }
                }
            }
        }
        System.out.print(max + " " + min);
    }
}