package acmp.task294;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Nuts {
    public static void main(String[] args) throws IOException {
        int[] arr1 = AdylUtils.readIntArray();
        int[] arr2 = AdylUtils.readIntArray();
        int result = getSum(arr1, arr2);
        System.out.println(result);
    }

    private static int getSum(int[] arr1, int[] arr2) {
        int quantity1 = arr1[0];
        int quantity2 = arr2[0];
        int procent1 = arr1[1];
        int procent2 = arr2[1];
        int price1 = arr1[2];
        int price2 = arr2[2];
        int a ;
        int sum1;
        int sum2 ;
        sum1 = quantity1 * procent1 / 100;
        quantity1 = quantity1 -sum1;

        sum2 = quantity2 * procent2 / 100;
        quantity2 = quantity2 - sum2;

        if (quantity1 > quantity2) {
            a = quantity1 - quantity2;
            sum1 =sum1 + a;
        } else {
            a = quantity2 - quantity1;
            sum2 = sum2 + a;
        }
        sum1 = sum1 * price1 + sum2 * price2;

        return sum1 ;
    }
}
