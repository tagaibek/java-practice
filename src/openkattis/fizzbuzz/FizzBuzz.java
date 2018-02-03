package openkattis.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        String result = getFizz(x, y, n);
        System.out.println(result);
    }

    private static String getFizz(int x, int y, int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if(i % x !=0 && i % y != 0 ) {
                result += i;
            } else {
                if (i % x == 0) result += "Fizz";
                if (i % y == 0) result += "Buzz";
            }

            result +="\n";
        }

        return result;
    }
}
