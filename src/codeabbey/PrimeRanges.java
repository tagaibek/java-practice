package codeabbey;

import java.util.Scanner;

public class PrimeRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int[] result = new int[tests];
        for (int i = 0; i < tests; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int currentNumber, count = 0;
            for (currentNumber = a; currentNumber <= b; currentNumber++) {
                int dividers = 0;
                for (int j = 2; j <= b; j++) {
                    if (checkSimple(currentNumber,j)) {
                    }
                    else dividers++;
                }
                if (dividers == 1){
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.println("answer: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }

    private static boolean checkSimple(int currentNumber, int j) {
        if (currentNumber % j ==0){
            return false;
        }
        return true;
    }
}
