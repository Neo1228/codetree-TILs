import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 받아서 배열에 저장합니다.
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 짝수 번째로 입력된 값의 합을 계산합니다.
        int evenIndexSum = 0;
        for (int i = 1; i < 10; i += 2) { // 인덱스가 1부터 시작해서 2씩 증가
            evenIndexSum += numbers[i];
        }

        // 3의 배수 번째로 입력된 값의 평균을 계산합니다.
        int multipleOfThreeSum = 0;
        int count = 0;
        for (int i = 2; i < 10; i += 3) { // 인덱스가 2부터 시작해서 3씩 증가
            multipleOfThreeSum += numbers[i];
            count++;
        }
        double multipleOfThreeAvg = (double) multipleOfThreeSum / count;

        // 출력합니다.
        System.out.printf("%d %.1f\n", evenIndexSum, Math.round(multipleOfThreeAvg * 10) / 10.0);

        sc.close();
    }
}