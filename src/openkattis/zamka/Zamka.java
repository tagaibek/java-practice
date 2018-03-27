package openkattis.zamka;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        // min - n
        int n = l;
        for (int i = l; i <= d; i++) {
            int sum = 0;
            int t = i;
            while (t != 0) {
                sum = sum + t % 10;
                t /= 10;
            }

            if (sum == x) {
                n = i;
                break;
            }
        }

        // max - m
        int m = d;
        for (int i = d; i >= l; i--) {
            int sum = 0;
            int t = i;
            while (t != 0) {
                sum += t % 10;
                t /= 10;
            }

            if (sum == x) {
                m = i;
                break;
            }
        }

        System.out.println(n);
        System.out.println(m);
    }
}
