package codeabbey;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciDivisibility {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        int[] divisibleNumber = new int[testCount];
        for (int i = 0; i < testCount; i++) {
            divisibleNumber[i] = sc.nextInt();
        }
        int[] result = findIndex(divisibleNumber);
        System.out.println("answer: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] findIndex(int[] divisibleNumber) {

        for (int j = 0 ; j <  divisibleNumber.length; j++) {
            int previousFib = 1;
            int currentFib = 1;
            int nextFib;
            for (int i = 3; i < 1000 ; i++) {
                nextFib = previousFib + currentFib;
                if (nextFib % divisibleNumber[j] == 0 ){
                    divisibleNumber[j] = i;
                    break;
                }

                previousFib=currentFib;
                currentFib=nextFib;
            }
        }

        return divisibleNumber;
    }
}
