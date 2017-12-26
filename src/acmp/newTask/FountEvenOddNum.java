package acmp.newTask;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class FountEvenOddNum {
    public static void main(String[] args) throws IOException {
        int[] numbersArray = AdylUtils.readIntArray();
        int result = getSums(numbersArray);
        System.out.println(result);
    }

    private static int getSums(int[] numbersArray) {
        int result = 0;
        for (int i : numbersArray) {
            if (i % 2 == 0) {
                result -= i;
            } else result += i;
        }

        return result;
    }
}
