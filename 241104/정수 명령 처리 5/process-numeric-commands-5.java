import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> a = new ArrayList<>();
        int m;

        for (int i = 0; i < n; i++) {
            st  = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_back")) {
                m = Integer.parseInt(st.nextToken());
                a.add(m);
            }else if(s.equals("get")) {
                m = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(a.get(m - 1)));
                bw.newLine();
            }else if(s.equals("pop_back")) {
                a.remove(a.size() - 1);
            }else if(s.equals("size")) {
                bw.write(String.valueOf(a.size()));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}