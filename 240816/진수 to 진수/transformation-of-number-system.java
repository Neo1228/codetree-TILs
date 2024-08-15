import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        char[] c = n.toCharArray();
        int num = 0;
        for(int i = 0; i < c.length; i++){
            String str = String.valueOf(c[i]);
            int add = Integer.parseInt(str);
            num = num * a + add;
        }
        int idx = 0;
        int[] arr = new int[100];
        while(true){
            if(num < b){
                arr[idx++] = num;
                break;
            }
            arr[idx++] = num % b;
            num /= b;
        }
        for(int i = idx - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }        
    }
}