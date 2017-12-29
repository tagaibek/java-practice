package acmp.task124;

import java.util.Scanner;

public class Lights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] results = getLights(n, m, sc);
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    private static int[] getLights(int n, int m, Scanner sc) {
        int[] arrayForN = new int[n];

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            arrayForN[a1 - 1] ++;
            arrayForN[a2 - 1] ++;
        }

        return arrayForN;
    }
}
