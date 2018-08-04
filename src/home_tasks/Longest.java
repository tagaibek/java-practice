package home_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] num = new int[length];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int result = longestNum(num);

        System.out.println("The length of the longest consecutive elements is : " + result);
    }

    private static int longestNum(int[] num) {
        if (num.length == 0) return 0;
        int maxLength = 1;
        Arrays.sort(num);

        int tmpLength = 1;
        for (int i = 0; i < num.length; i++) {
            if ( i + 1 != num.length && num[i + 1] - 1 == num[i]) {
                tmpLength++;
            }
            else {
                if (tmpLength > maxLength) {
                    maxLength = tmpLength;
                }

                tmpLength = 1;
            }
        }
        return maxLength;
    }

    private static int[] sortArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = num[i];
            int min_i = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < min) {
                    min = num[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = num[i];
                num[i] = num[min_i];
                num[min_i] = tmp;
            }
        }

        return num;
    }
}
