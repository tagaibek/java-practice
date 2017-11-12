package exams.exam0806;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 11.08.2017.
 */
public class Arifmetix {
    public static void main(String[] args) throws IOException {
        int[] arsNum = AdylUtils.readIntArray();
        int m = findSecondArif(arsNum);
        System.out.println(m);
    }

    private static int findSecondArif(int[] arsNum) {
        int x = 0;
        int d = arsNum[1] - arsNum[0];
        int prev = arsNum[1];
        for (int i = 2; i < arsNum[2]; i++) {
            x = prev + d;
            prev = x;
        }

        return x;
    }
}
