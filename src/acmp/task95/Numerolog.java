package acmp.task95;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Numerolog {
    public static void main(String[] args) throws IOException {
        int num = AdylUtils.readInt();
        int k = 0;
        while (num > 9) {
            num = getSum(num);
            k++;
        }
        System.out.println(num + " " + k);
    }

    public static int getSum(int num) {
        char[] numberChars = (num + "").toCharArray();
        int sum = 0;
        for (int i : numberChars) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
}