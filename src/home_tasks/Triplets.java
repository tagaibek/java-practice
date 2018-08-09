package home_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List<int[]> result = findTriplets2(testArray, target);
        for (int[] triplets : result) {
            System.out.print(Arrays.toString(triplets));
        }
    }

    private static List<int[]> findTriplets2(int[] arr, int target){
        List<int[]> allTriplets = new ArrayList<>();
        Arrays.sort(arr);

        for(int i1 = 0; i1 < arr.length - 2; i1++) {
            if (arr[i1] > target) continue;

            for (int i2 = i1 + 1; i2 < arr.length -1; i2++) {
                if (arr[i1] + arr[i2] > target) continue;

                for (int i3 = i2 + 1; i3 <  arr.length; i3++) {
                    int sum = arr[i1] + arr[i2] + arr[i3];
                    if (sum > target) {
                        break;
                    } else if (sum == target) {
                        allTriplets.add(new int[]{arr[i1], arr[i2], arr[i3]});
                    }
                }
            }
        }

        return allTriplets;
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
