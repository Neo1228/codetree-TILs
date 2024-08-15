import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] binary = new int[5];
        for(int i = 0; i < binary.length; i++){
            binary[i] = sc.nextInt();
        }
        for(int j = 0; j < binary.length; j++){
            num = num * 2 + binary[j];
        }
        System.out.println(num);
    }
}