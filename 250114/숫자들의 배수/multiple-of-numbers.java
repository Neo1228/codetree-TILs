import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] arr = new int[10];
    int cnt=0;
    for(int i=0;i<10;i++){
      arr[i]=k*(i+1);
      System.out.printf("%d ",arr[i]);
      if(arr[i]%5==0) {
        cnt++;
        if(cnt==2) break;
      }
     }
    }
}