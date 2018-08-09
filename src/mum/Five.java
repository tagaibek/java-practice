package mum;

import java.util.Arrays;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        int[] first = new int[length1];
        for (int i = 0; i < length1; i++) {
            first[i] = sc.nextInt();
        }

        int length2 = sc.nextInt();
        int[] second = new int[length2];
        for (int i = 0; i < length2; i++) {
            second[i] = sc.nextInt();
        }

        int[] common = findCommon(first, second);
        System.out.println(Arrays.toString(common));
    }

    private static int[] findCommon(int[] first, int[] second) {
        int count = 0;
        if (second == null || first == null) {
            return null;
        }

        if (second.length == 0 || first.length == 0) {
            return new int[0];
        }

        for (int i1 : second)
            for (int aFirst : first)
                if (i1 == aFirst) count++;

        int[] result = new int[count];
        int m = 0;
        for (int i1 : second)
            for (int aFirst : first)
                if (i1 == aFirst)
                    result[m++] = aFirst;

        return result;
    }
}
