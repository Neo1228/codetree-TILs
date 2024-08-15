import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        char[] binary = str.toCharArray();
        for(int j = 0; j < binary.length; j++){
            String binaryStr = String.valueOf(binary[j]);
            int a = Integer.parseInt(binaryStr);
            num = num * 2 + a;
        }
        System.out.println(num);
    }
}