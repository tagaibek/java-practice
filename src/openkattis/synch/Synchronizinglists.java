package openkattis.synch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longs = sc.nextInt();
        getOrder(longs, sc);
    }

    private static int getOrder(int longs, Scanner sc) {
        int[] ints = new int[longs];

        int[] ints1 = new int[longs];

        int[] ints2 = new int[longs];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = sc.nextInt();
        }

        int maxInt = 0;
        int maxInt1 = 0;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxInt) {
                maxInt = ints[i];
                index = i;
            }
        }
        for (int j = 0; j < ints1.length; j++) {
            if (maxInt1 < ints1[j]) {
                maxInt1 = ints1[j];
            }
        }
        for (int l = 0; l < ints2.length; l++) {
            ints2[index] = maxInt1;
        }
        return 1;
    }
}
