package codeabbey;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciDivisibility {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCount = AdylUtils.readInt();
        int[] divisibleNumber = new int[testCount];
        for (int i = 0; i < testCount; i++) {
            divisibleNumber[i] = sc.nextInt();
        }
        int[] result = fountIndex(divisibleNumber);
        System.out.println("answer: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] fountIndex(int[] divisibleNumber) {

        for (int j = 0 ; j <  divisibleNumber.length; j++) {
            int n0 = 1;
            int n1 = 1;
            int n2;
            for (int i = 3; i < 1000 ; i++) {
                n2=n0+n1;
                if (n2 % divisibleNumber[j] == 0 ){
                    divisibleNumber[j] = i;
                    break;
                }
                n0=n1;
                n1=n2;

            }
        }

        return divisibleNumber;
    }
}
