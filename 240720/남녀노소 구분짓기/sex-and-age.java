import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();
        if(age >= 19){
            if(sex == 0){
                System.out.print("MAN");
            }else{
                System.out.print("WOMAN")
            }
        }
        if(age < 19){
            if(sex == 0){
                System.out.print("BOY");
            }else(sex == 1){
                System.out.print("GIRL");
            }
        }
    }
}