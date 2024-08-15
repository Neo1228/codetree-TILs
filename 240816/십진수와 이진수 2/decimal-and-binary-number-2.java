import java.util.Scanner;

public class Main {

    final static int MAX = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] binary = s.toCharArray();
        int num = 0;
        int idx = 0;
        int[] binaryArr = new int[MAX];
        for(int i = 0; i < binary.length; i++) {
            String str = String.valueOf(binary[i]);
            int a = Integer.parseInt(str);
            num = num * 2 + a;
        }
        num = num * 17;
        while(true){
            if(num < 2){
                binaryArr[idx++] = num;
                break;
            }
            binaryArr[idx++] = num % 2;
            num /= 2;
        }
        for(int i = idx - 1; i >= 0; i--){
            System.out.print(binaryArr[i]);
        }
    }
}