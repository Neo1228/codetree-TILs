import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 2; i <= 9; i++){
            System.out.print(str.charAt(i));
        }
    }
}