import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double[] arr = new double[8];

    for(int i =0;i<8;i++){
      arr[i] = sc.nextDouble();
    }
    float sum =0;
    for(int i =0;i<8;i++){
      sum+=arr[i];
    }
    System.out.printf("%.1f",sum/8);
    sc.close();
    }
}