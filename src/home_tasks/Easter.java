package home_tasks;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result = easter(year);
        System.out.println(result);
    }

    private static int easter(int year) {
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8 ) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4; int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l ) / 451;
        int n = (h + l - 7 * m + 114 ) / 31;
        int p = (h + l - 7 * m + 114 ) % 31;
        int dateEaster = 10 * (p + 1) + n;
        return dateEaster;
    }
}
