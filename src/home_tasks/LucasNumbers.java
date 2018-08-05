package home_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class LucasNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] result = new int[length];
        result[0] = 2;
        result[1] = 1;
        for (int i = 2; i < result.length; i++) {
            result[i] = result[i-2] + result[i-1];
        }

        System.out.println("First " + length + " Lucas a numbers:" + Arrays.toString(result));
    }
}
