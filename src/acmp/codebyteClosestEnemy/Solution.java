package acmp.codebyteClosestEnemy;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String strings = s.nextLine();
        String[] strings1 = strings.split(",");
        int n = strings1.length;
        for (int i = 0; i < n; i ++) {
            String row = strings1[i].trim();
            //removes quotes
            strings1[i]= row.substring(1, row.length() - 1);
        }
        String result = ClosestEnemyII(strings1);
        System.out.println(result);
    }

    private static String ClosestEnemyII(String[] strArr) {
        int n = strArr.length, oi = -1, oj = -1;
        int[][] array2d = new int[n][n];

        for (int i = 0; i < n; i++) {
            String row = strArr[i];
            for (int j = 0; j < n; j++) {
                int value = row.charAt(j) - '0';
                array2d[i][j] = value;
                if (value == 1) {
                    oi = i;
                    oj = j;
                }
            }
        }

        if (oi == -1) {
            return "0";
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array2d[i][j] == 2) {
                    int v1 = Math.abs(i - oi);
                    int v2 = n - v1;

                    int vertical = Math.min(v1, v2);

                    int h1 = Math.abs(j - oj);
                    int h2 = n - h1;

                    int horizontal = Math.min(h1, h2);

                    int steps = vertical + horizontal;

                    if (steps < min) {
                        min = steps;
                    }
                }
            }
        }

        if (min < Integer.MAX_VALUE) {
            return String.valueOf(min);
        } else {
            return "0";
        }
    }
}
