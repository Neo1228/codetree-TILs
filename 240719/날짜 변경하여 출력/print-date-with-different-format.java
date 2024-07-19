import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(".");
        String yyyy = sc.next();
        String mm = sc.next();
        String dd = sc.next();
        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}