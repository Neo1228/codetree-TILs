import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> ar = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push_back")) {
                int a = Integer.parseInt(st.nextToken());
                ar.add(a);
            } else if (s.equals("pop_back")) {
                ar.remove(ar.size() - 1);
            } else if (s.equals("size")) {
                bw.write(ar.size() + "\n");
            } else if (s.equals("get")) {
                int a = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(ar.get(a - 1)) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}