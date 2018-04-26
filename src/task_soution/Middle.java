package task_soution;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = AdylUtils.readInt();
        int result = 0;
        if (length % 2 > 0) {
            int[] arrayNum = new int[length];
            for (int i = 0; i < length; i++) {
                arrayNum[i] = sc.nextInt();
            }
            result = foundMiddle(arrayNum);
        }
        System.out.println(result);
    }

    private static int foundMiddle(int[] arrayNum) {
        int ret = 0;
        int middleIndex = arrayNum.length / 2;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[middleIndex] < arrayNum[i]) {
                ret++;
            }
        }
        int length = arrayNum.length -1;
        if (ret == length){
            ret = 1;
        }else ret = 0;
        return ret;
    }
}
