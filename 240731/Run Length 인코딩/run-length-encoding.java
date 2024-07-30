import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder encodedString = new StringBuilder();
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            int count = 1;
            while (i + 1 < length && input.charAt(i) == input.charAt(i + 1)) {
                i++;
                count++;
            }
            encodedString.append(input.charAt(i)).append(count);
        }

        System.out.println(encodedString.length());
        System.out.println(encodedString.toString());
    }
}