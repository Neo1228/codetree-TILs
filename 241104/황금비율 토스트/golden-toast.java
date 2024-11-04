import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 초기 빵 문자열 길이
        int m = Integer.parseInt(st.nextToken()); // 명령어 개수
        String str = br.readLine(); // 초기 빵 문자열

        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            l.add(str.charAt(i));
        }

        // 초기 커서는 리스트의 맨 끝에 위치
        ListIterator<Character> it = l.listIterator(l.size());

        // 명령어 처리
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (input.equals("L")) { // 왼쪽으로 커서 이동
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (input.equals("R")) { // 오른쪽으로 커서 이동
                if (it.hasNext()) {
                    it.next();
                }
            } else if (input.equals("D")) { // 커서 위치의 다음 빵 삭제
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (input.equals("P")) { // 커서 위치에 새로운 빵 추가
                char a = st.nextToken().charAt(0);
                it.add(a);
            }
        }

        // 결과 출력
        ListIterator<Character> it2 = l.listIterator();
        while (it2.hasNext()) {
            bw.write(it2.next());
        }
        bw.flush();
        bw.close();
    }
}