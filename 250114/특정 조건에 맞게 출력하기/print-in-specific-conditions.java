import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];

    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();

      if(arr[i]==0){
        break;
      }
    }
    for(int i=0;arr[i]!=0;i++){
      if(arr[i]%2==0){
        System.out.printf("%d ",arr[i]/2);
      }
      else{
        System.out.printf("%d ",arr[i]+3);
      }
    }


    }
}