package acmp.problem_left;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

    private static int[] leftRotation(int[] a, int d) {
        int[] ints1 = new int[d];
        for (int i = 0; i < d; i++) {
            if (i <= d) {
                ints1[i] = a[i];
            }
        }
        int i = 0;
        for (int j = d; j < a.length; j++) {
            a[i] = a[j];
            i++;
        }
        int c = 0;
        for (int z = i; z < a.length; z++) {
            a[z] = ints1[c];
            c++;
        }

        return a;
    }
}
