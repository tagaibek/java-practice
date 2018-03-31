package openkattis.zamka;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        int n = getResult(l,d,x ,1);
        int m = getResult(d,l,x,-1);

        System.out.println(n);
        System.out.println(m);
    }

    private static int getResult(final int from, final int to, final int x, final int sign) {
        for (int i = from; i <= to; i = i + sign) {
            int sum = getSumOfDigits(i);
            if (sum == x) {
                return i;
            }
        }

        return -1;
    }

    private static int getSumOfDigits(int number){
        int sum = 0;
        int tmp = number;
        while (tmp != 0) {
            sum = sum + tmp % 10;
            tmp /= 10;
        }

        return sum;
    }
}
