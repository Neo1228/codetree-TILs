import java.util.Scanner;

public class Main {
    public static int manhattan(int a, int b, int c, int d) {
        return Math.abs(a - c) + Math.abs(b - d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mapX = new int[n];
        int[] mapY = new int[n];

        for (int i = 0; i < n; i++) {
            mapX[i] = sc.nextInt();
            mapY[i] = sc.nextInt();
        }

        int totalDistance = 0;
        for (int i = 0; i < n - 1; i++) {
            totalDistance += manhattan(mapX[i], mapY[i], mapX[i + 1], mapY[i + 1]);
        }

        int minDistance = totalDistance;
        for (int i = 1; i < n - 1; i++) {
            int skippedDistance = manhattan(mapX[i - 1], mapY[i - 1], mapX[i], mapY[i])
                                + manhattan(mapX[i], mapY[i], mapX[i + 1], mapY[i + 1]);
            int directDistance = manhattan(mapX[i - 1], mapY[i - 1], mapX[i + 1], mapY[i + 1]);
            int currentDistance = totalDistance - skippedDistance + directDistance;
            minDistance = Math.min(minDistance, currentDistance);
        }

        System.out.println(minDistance);
    }
}