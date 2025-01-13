import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arr2 = new int[n];
    int index = 0; // arr2에 값을 저장할 위치를 추적

    // 첫 번째 배열 입력 및 짝수만 두 번째 배열에 복사
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0) { // 짝수인지 확인
        arr2[index++] = arr[i];
      }
    }

    // 두 번째 배열 출력
    for (int i = 0; i < index; i++) { // 유효한 짝수 개수만 출력
      System.out.printf("%d ", arr2[i]);
    }
    }
}