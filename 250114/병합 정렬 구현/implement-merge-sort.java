import java.util.*;
import java.io.*;

public class Main {

    private static int[] merge_arr;
    private static int n;

    private static void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static int[] merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;

        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                merge_arr[k] = arr[i];
                k++;
                i++;
            } else {
                merge_arr[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i <= mid) {
            merge_arr[k] = arr[i];
            k++;
            i++;
        }

        while(j <= high) {
            merge_arr[k] = arr[j];
            k++;
            j++;
        }

        for(k = low; k <= high; k++) {
            arr[k] = merge_arr[k];
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        merge_arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}