package exams.exam0826_04;



import java.io.IOException;

import java.util.Scanner;

/**
 * Created by Human on 26.08.2017.
 */
public class IndexValue {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int j = in.nextInt();
            int k = in.nextInt();
            for (int j1 = j - 1; j1 < k; j1++) {
                System.out.print(a[j1] + " ");
            }
            System.out.println();
        }

    }
}
//3-микро 4 дом 10 кв 1подезд
