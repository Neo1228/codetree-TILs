import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];

    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    int sum = 0;
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= 250) {
        break;
      }
      sum += a[i];
      count++;
    }

    // 평균 계산 (260 전까지의 개수로 나눔)
    float avg = (float) sum / count;

    System.out.printf("%d %.1f", sum, avg);

    sc.close();
  }
    
    }