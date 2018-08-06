package mirlan;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("reversed: " + reversed(i));
    }

    private static int reversed(int n) {
        int i = Math.abs(n);

        int reversed = 0;
        while (i > 9) {
            reversed = (reversed + i % 10) * 10;
            i = i / 10;
        }

        return (reversed + i) * (n < 0 ? -1 : 1);
    }
}
