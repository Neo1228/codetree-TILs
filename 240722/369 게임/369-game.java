import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            String numStr = Integer.toString(i);
            if(i % 3 == 0 || numStr.contains("3") || numStr.contains("6") || numStr.contains("9")){
                System.out.print(0 + " ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}