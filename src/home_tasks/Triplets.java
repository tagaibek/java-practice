package home_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] testArray = new int[len];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = findTriplets(testArray, target);
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    private static int[] findTriplets(int[] testArray, int target) {
        Arrays.sort(testArray);
        int[] result = new int[3];
        for (int i = 0; i < testArray.length; i++) {
            int sum = testArray[i] + testArray[i + 1];
            int j = i + 2;
            while (sum != target) {
                int sum2 = sum;
                if (j == testArray.length) {
                    break;
                }
                sum = sum + testArray[j];
                if (sum == target) {
                    result[0] = testArray[i];
                    result[1] = testArray[i + 1];
                    result[2] = testArray[j];
                    return result;
                } else sum = sum2;
                j++;
            }

        }
        return result;
    }
}
