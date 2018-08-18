package codeabbey.integer_factorization;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tests = new int[sc.nextInt()];
        for (int i = 0; i <tests.length ; i++) {
            tests[i] = sc.nextInt();
        }
        String[] result = factorization(tests);
        System.out.println(Arrays.toString(result));
    }

    private static String[] factorization(int[] tests) {
        String[] result = new String[tests.length];
        for (int i = 0; i < tests.length; i++) {
            int number = tests[i];
            StringBuilder s = new StringBuilder();
            int j = 2;
            while (number != 1) {
                if (number % j == 0){
                    number = number / j;
                    if (s.length() == 0){
                        s.append(j);
                    }
                    else s.append("*").append(j);
                }
                else j++;
            }
            result[i] = s.toString();

        }
        return result;
    }
}
