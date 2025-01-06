import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_back")) {
                int a = sc.nextInt();
                ar.add(a);
            } else if (s.equals("pop_back")) {
                ar.remove(ar.size() - 1);
            } else if (s.equals("size")) {
                System.out.println(ar.size());
            } else if (s.equals("get")) {
                int a = sc.nextInt();
                System.out.println(ar.get(a - 1));
            }
        }
    }
}