import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

      double[] arr = new double[sc.nextInt()];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextDouble();
      }
      float sum =0;
      for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
      }
      float avg = sum/arr.length;
      System.out.printf("%.1f\n",avg);
      if(avg>=4.0){
        System.out.printf("perfect");
      }
      else if(avg>=3.0){
        System.out.printf("Good");
      }
      else if(avg<3.0){
        System.out.printf("Poor");
      }
    }
}