package task_soution;

import acmp.utils.AdylUtils;

import java.io.IOException;
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
            result = verifyCentered(arrayNum);
        }
        System.out.println(result);
    }

    private static int verifyCentered(int[] arrayNum) {
        int middleIndex = arrayNum.length / 2;
        for (int anArrayNum : arrayNum) {
            if (arrayNum[middleIndex] > anArrayNum) {
                return 0;
            }
        }
        return 1;
    }
}