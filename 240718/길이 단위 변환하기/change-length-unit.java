public class Main {
    public static void main(String[] args) {
        double feet = 30.48;
        int mile = 160934;
        double feets = feet * 9.2;
        double miles = mile * 1.3;
        System.out.printf("9.2ft = %.1fcm\n", feets);
        System.out.printf("1.3mi = %.1fcm", miles);
    }
}