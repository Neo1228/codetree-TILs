import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sumVal = 0;
    for(int i = 1; i <= n; i++){
        if(n % i == 0 && i != n){
            sumVal += i;
        }
    }
    if(sumVal == n){
        System.out.println("P");
    }else{
        System.out.println("N");
    }
    }
}