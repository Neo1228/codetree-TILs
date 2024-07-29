import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = new char[3];
        int[] arr = new int[3];
        int[] countArr = new int[]{0, 0, 0 ,0};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr1[i] == 'Y'){
                if (arr[i] >= 37) {
                    a = 0;
                    countArr[a]++;
                }
                else{
                    a = 2;
                    countArr[a]++;
                }
            }else{
                if(arr[i] >= 37) {
                    a = 1;
                    countArr[a]++;
                }else{
                    a = 3;
                    countArr[a]++;
                }
            }
        }
        for(int i = 0; i < countArr.length; i++) {
            System.out.print(countArr[i] + " ");
        }
        if(countArr[0] >= 2){
            System.out.print("E");
        }
    }
}