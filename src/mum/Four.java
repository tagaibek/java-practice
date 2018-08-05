package mum;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int reversed = reverse(i);
        System.out.println("reversed: " + reversed);
    }

    private static int reverse(int n) {
        int sign = n < 0 ? -1 : 1;
        int i = n * sign;

        int reversed = 0;
        while( i != 0 ){
            reversed = reversed * 10 + i % 10;
            i /= 10;
        }

        return reversed * sign;
    }
}
