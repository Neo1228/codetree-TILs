import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 기수 정렬 함수
    public static List<Integer> radixSort(List<Integer> arr, int maxDigits) {
        for (int pos = 0; pos < maxDigits; pos++) {
            // 자릿수별로 0~9까지의 리스트 생성
            List<List<Integer>> arrNew = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                arrNew.add(new ArrayList<>());
            }

            // 각 숫자의 pos번째 자릿수에 따라 분류
            for (int num : arr) {
                int digit = getDigit(num, pos);
                arrNew.get(digit).add(num);
            }

            // 정렬된 배열을 다시 하나의 리스트로 병합
            List<Integer> storeArr = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                storeArr.addAll(arrNew.get(i));
            }

            // 새로운 정렬된 배열을 원래 배열로 교체
            arr = storeArr;
        }

        return arr;
    }

    // 숫자의 pos번째 자릿수를 반환하는 함수
    public static int getDigit(int number, int pos) {
        return (number / (int) Math.pow(10, pos)) % 10;
    }

    // 숫자에서 가장 긴 자릿수(최대 자릿수)를 계산하는 함수
    public static int getMaxDigits(List<Integer> arr) {
        int maxNumber = 0;
        for (int num : arr) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return String.valueOf(maxNumber).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄: n 입력
        int n = scanner.nextInt();

        // 둘째 줄: n개의 숫자 입력
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // 최대 자릿수 계산
        int maxDigits = getMaxDigits(arr);

        // 기수 정렬 실행
        List<Integer> sortedArr = radixSort(arr, maxDigits);

        // 정렬된 결과 출력
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
