import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][4];

    for(int i =0;i<n;i++){
      for(int j =0;j<4;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int cnt=0;
    for(int i =0;i<n;i++){
      double sum=0;
      for(int j =0;j<4;j++){
        sum+=arr[i][j];
      }
      double avg = sum/4;
      if(avg>=60){
        System.out.printf("pass\n");
        cnt++;
      }
      else{
        System.out.printf("fail\n");
      }
    }
    System.out.printf("%d",cnt);
    }
}