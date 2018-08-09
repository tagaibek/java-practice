package home_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tests = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] result = sortArray(tests);
        System.out.println(Arrays.toString(result));
    }


    private static int[] sortArray(int[] tests) {
        for (int i = 0; i < tests.length; i++) {
            int j = i;
            while (j != 0) {
                if (tests[j] < tests[j - 1]) {
                    int tmp = tests[j];
                    tests[j] = tests[j - 1];
                    tests[j - 1] = tmp;
                }
                j--;
            }

        }
        return tests;
    }
}
