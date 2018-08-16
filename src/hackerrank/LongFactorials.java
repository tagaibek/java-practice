package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger integer = BigInteger.valueOf(0);
        long sum = 1000000000;

        n = n - 1;
        if (n > 0 && n < 101){
            while (n !=0){
                if ( sum * n > 1000000000){
                    integer = BigInteger.valueOf(sum * n);
                }
            }
            integer = BigInteger.valueOf(sum);
        }
        System.out.println(integer);
    }
}
