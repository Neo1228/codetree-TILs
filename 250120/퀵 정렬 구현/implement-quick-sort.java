import java.util.*;
import java.io.*;

public class Main {

    private static int[] arr;

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i += 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void quick_sort(int[] arr, int low, int high) {
        int pos = 0;
        if (low < high) {
            pos = partition(arr, low, high);
            quick_sort(arr, low, pos - 1);
            quick_sort(arr, pos + 1, high);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quick_sort(arr, 0, n - 1);

        for(int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}