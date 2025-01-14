import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[20];
    arr[0] = 1;
    arr[1] = n;
    System.out.printf("%d ",arr[0]);
    System.out.printf("%d ",arr[1]);

    for(int i=2;i<20;i++){
      arr[i] = arr[i-1]+arr[i-2];
      System.out.printf("%d ",arr[i]);
      if(arr[i]>100) break;
    }
  }
}