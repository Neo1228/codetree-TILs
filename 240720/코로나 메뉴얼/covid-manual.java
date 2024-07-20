import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String corona = sc.next();
        int temp = sc.nextInt();
        String a = "a";
        if (corona.equals("Y")){
            if (temp >= 37) {
                a = "A";
            }else{
                a = "C";
            }
        }else {
            if (temp >= 37) {
                a = "B";
            } else {
                a = "D";
            }
        }
        String corona_2 = sc.next();
        int temp_2 = sc.nextInt();
        String b = "a";
        if (corona_2.equals("Y")){
            if (temp_2 >= 37) {
                b = "A";
            }else{
                b = "C";
            }
        }else {
            if (temp_2 >= 37) {
                b = "B";
            } else {
                b = "D";
            }
        }
        String corona_3 = sc.next();
        int temp_3 = sc.nextInt();
        String c = "a";
        if (corona_3.equals("Y")){
            if (temp_3 >= 37) {
                c = "A";
            }else{
                c = "C";
            }
        }else {
            if (temp_3 >= 37) {
                c = "B";
            } else {
                c = "D";
            }
        }
        if ((a == "A" && b == "A") || (b == "A" && c == "A") || (a == "A" && c == "A")) {
            System.out.println("E");
        }else if(a == "A" && b == "A" && c == "A") {
            System.out.println("E");
        }
        else {
            System.out.println("N");
        }

    }
}