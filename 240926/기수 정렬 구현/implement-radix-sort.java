import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> radixSort(List<Integer> arr, int k) {
        for (int pos = k - 1; pos >= 0; pos--) {
            List<List<Integer>> arrNew = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                arrNew.add(new ArrayList<>());
            }

            for (int num : arr) {
                int digit = getDigit(num, pos);
                arrNew.get(digit).add(num);
            }

            List<Integer> storeArr = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                storeArr.addAll(arrNew.get(i));
            }

            arr = storeArr;
        }

        return arr;
    }

    public static int getDigit(int number, int pos) {
        return (number / (int) Math.pow(10, pos)) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int maxDigits;
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }
        
        maxDigits = String.valueOf(num).length();
        List<Integer> sortedArr = radixSort(arr, maxDigits);
        Iterator<Integer> itr = sortedArr.iterator();
        for (int i = 0; i < sortedArr.size(); i++) {
            System.out.print(itr.next() + " ");
        }
    }
}