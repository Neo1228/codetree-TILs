import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> ls = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            ls.add(s.charAt(i));
        }
        ListIterator<Character> l = ls.listIterator(ls.size());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("L")) {
                if (l.hasPrevious()) {
                    l.previous();
                }
            } else if (cmd.equals("R")) {
                if (l.hasNext()) {
                    l.next();
                }
            } else if (cmd.equals("D")) {
                if (l.hasNext()) {
                    l.next();
                    l.remove();
                }
            } else if (cmd.equals("P")) {
                char ch = st.nextToken().charAt(0);
                l.add(ch);
            }
        }
        for (char c : ls) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
