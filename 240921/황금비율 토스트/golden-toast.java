import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<Character>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            l.add(str.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());

        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0);
            if (c == 'L') {
                while(it.hasPrevious()) {
                    it.previous();
                    break;
                }
            } else if (c == 'R') {
                while (it.hasNext()) {
                    it.next();
                    break;
                }
            } else if (c == 'D') {
                while (it.hasNext()) {
                    it.next();
                    it.remove();
                    break;
                }
            } else {
                char a = sc.next().charAt(0);
                it.add(a);
            }
        }
        ListIterator <Character> it2 = l.listIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next());
        }
    }
}