import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_front")) {
                l.addFirst(sc.nextInt());
            } else if(s.equals("push_back")) {
                l.addLast(sc.nextInt());
            } else if(s.equals("pop_front")) {
                System.out.println(l.pollFirst());
            } else if(s.equals("pop_back")) {
                System.out.println(l.pollLast());
            } else if (s.equals("size")) {
                System.out.println(l.size());
            } else if(s.equals("empty")) {
                if(l.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.equals("front")) {
                System.out.println(l.peekFirst());
            } else {
                System.out.println(l.peekLast());
            }
        }
    }
}