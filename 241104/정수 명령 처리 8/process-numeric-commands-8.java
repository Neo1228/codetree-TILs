import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        LinkedList <Integer> ls = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if(input.equals("push_back")) {
                int m = Integer.parseInt(st.nextToken());
                ls.addLast(m);
            }else if(input.equals("push_front")){
                int m = Integer.parseInt(st.nextToken());
                ls.addFirst(m);
            }else if(input.equals("pop_front")) {
                bw.write(String.valueOf(ls.pollFirst()));
                bw.newLine();
            }else if(input.equals("pop_back")) {
                bw.write(String.valueOf(ls.pollLast()));
                bw.newLine();
            }else if(input.equals("size")) {
                bw.write(String.valueOf(ls.size()));
                bw.newLine();
            }else if(input.equals("empty")) {
                if(ls.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                }else {
                    bw.write("0");
                    bw.newLine();
                }
            }else if(input.equals("front")) {
                bw.write(String.valueOf(ls.get(0)));
                bw.newLine();
            }else {
                bw.write(String.valueOf(ls.get(ls.size() - 1)));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}