import java.util.*;
import java.io.*;

public class Main {

    private static int[] arr;

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = i * 2;
        int r = i * 2 + 1;

        if (l <= n && arr[l] > arr[largest]) {
            largest = l;
        }
        if(r <= n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void heap_sort(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i);
        }

        for (int i = n; i > 1; i--) {
            swap(arr, 1, i);
            heapify(arr, i - 1, 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1]; // 1-based 인덱싱 사용

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heap_sort(arr, n);

        for (int i = 1; i <= n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}