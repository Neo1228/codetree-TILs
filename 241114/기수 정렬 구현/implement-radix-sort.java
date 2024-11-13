import java.io.*;
import java.util.*;

public class Main {

    public static void radixSort(int[] arr, int k) {
        for (int pos = k - 1; pos >= 0; pos--) {
            List<Integer>[] store_arr = new ArrayList[10];
            for (int i = 0; i < 10; i++) {
                store_arr[i] = new ArrayList<>();
            }
            for (int i = 0; i < arr.length; i++) {
                int digit = getDigit(arr[i], pos);
                store_arr[digit].add(arr[i]);
            }

            int index = 0;
            for (int i = 0; i < store_arr.length; i++) {
                List<Integer> new_list = store_arr[i];
                for (int j = 0; j < new_list.size(); j++) {
                    arr[index++] = new_list.get(j);
                }
            }
        }
    }

    public static int getDigit(int num, int pos) {
        return (int) (num / Math.pow(10, pos)) % 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        radixSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");

        }
        bw.flush();
        bw.close();
    }
}