import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\.");

        String year = scanner.next();
        String month = scanner.next();
        String day = scanner.next();

        System.out.println(Integer.parseInt(month) + "-" + Integer.parseInt(day) + "-" + year);
        
        scanner.close();
    }
}