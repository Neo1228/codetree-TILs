import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> l = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push_back")) {
                int a = Integer.parseInt(st.nextToken());
                l.addLast(a);
            } else if (s.equals("push_front")) {
                int a = Integer.parseInt(st.nextToken());
                l.addFirst(a);
            } else if (s.equals("pop_front")) {
                bw.write(String.valueOf(l.pollFirst()));
                bw.newLine();
            } else if (s.equals("pop_back")) {
                bw.write(String.valueOf(l.pollLast()));
                bw.newLine();
            } else if (s.equals("size")) {
                bw.write(String.valueOf(l.size()));
                bw.newLine();
            } else if (s.equals("empty")) {
                if (l.isEmpty()) {
                    bw.write(String.valueOf(1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else if (s.equals("front")) {
                bw.write(String.valueOf(l.peekFirst()));
                bw.newLine();
            } else {
                bw.write(String.valueOf(l.peekLast()));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}