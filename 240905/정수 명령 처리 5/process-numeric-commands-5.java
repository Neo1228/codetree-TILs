import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("push_back")) {
                v.add(sc.nextInt());
            }else if(s.equals("get")) {
                System.out.println(v.get(sc.nextInt() - 1));
            } else if(s.equals("size")) {
                System.out.println(v.size());
            } else {
                v.remove(v.size() - 1);
            }
        }
    }
}