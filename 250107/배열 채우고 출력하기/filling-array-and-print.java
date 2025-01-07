import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

        String input = sc.nextLine();
        String[] p = input.split(" ");
        char[] chars = new char[p.length];

        for(int i=0; i<p.length; i++){
            chars[i]= p[i].charAt(0);
        }

        for(int i = chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        sc.close();
  }
}