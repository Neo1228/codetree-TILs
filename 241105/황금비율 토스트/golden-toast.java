import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> l = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            l.add(str.charAt(i));
        }

        ListIterator<Character> lt = l.listIterator(l.size());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char input = st.nextToken().charAt(0);
            if (input == 'L') {
                if(lt.hasPrevious()) {
                    lt.previous();
                }
            }else if (input == 'R') {
                if (lt.hasNext()) {
                    lt.next();
                }
            }else if (input == 'D') {
                if (lt.hasNext()) {
                    lt.next();
                    lt.remove();
                }
            }else {
                char a = st.nextToken().charAt(0);
                lt.add(a);
            }
        }

        ListIterator<Character> lt2 = l.listIterator();
        while(lt2.hasNext()) {
            bw.write(lt2.next());
        }
        bw.flush();
        bw.close();
    }
}