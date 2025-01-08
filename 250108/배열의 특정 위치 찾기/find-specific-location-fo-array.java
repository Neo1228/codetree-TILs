import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<10;i+=2){
            sum1 += arr[i];
        }
        for(int i=2;i<10;i+=3){
            sum2 += arr[i];
        }
        System.out.printf("%d ",sum1);
        System.out.printf("%.1f",(float)sum2/3);
    }
}