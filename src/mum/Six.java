package mum;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("poe: " + findPoe(arr));
    }

    private static int findPoe(int[] a) {
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
            int sum2 = 0;
            for (int j = a.length-1; j > i + 1; j--) {
                sum2 += a[j];
            }
            if (sum1 == sum2){
                return i +1;
            }
        }
        return -1;
    }
}
