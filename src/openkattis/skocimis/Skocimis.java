package openkattis.skocimis;

import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = getCount(a, b, c);
        System.out.println(result);
    }

    private static int getCount(int a, int b, int c) {
        int i = b - a - 1;
        int j = c - b - 1;

        return (i > j) ? i : j;
    }
}
