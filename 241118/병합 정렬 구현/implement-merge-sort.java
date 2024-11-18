import java.util.*;
import java.io.*;

public class Main {

    private static int n;
    private static int[] merged_arr;

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                merged_arr[k] = arr[i];
                k += 1; i += 1;
            }
            else {
                merged_arr[k] = arr[j];
                k += 1; j += 1;
            }
        }

        while( i <= mid ) {
            merged_arr[k] = arr[i];
            k += 1; i +=1;
        }

        while(j <= high) {
            merged_arr[k] = arr[j];
            k += 1; j += 1;
        }

        for(k = low; k <= high; k += 1) {
            arr[k] = merged_arr[k];
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        merged_arr = new int[n];

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