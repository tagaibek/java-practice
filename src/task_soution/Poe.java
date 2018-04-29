package task_soution;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.Scanner;

public class Poe {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = AdylUtils.readInt();
        int result = 0;

        int[] arrayNum = new int[length];
        for (int i = 0; i < length; i++) {
            arrayNum[i] = sc.nextInt();
        }
        result = findPoe(arrayNum);
        System.out.println(result);

    }

    private static int findPoe(int[] arrayNum) {
        int count = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            int count1 = 0;
            count += arrayNum[i];
            for (int j = i + 2; j < arrayNum.length; j++) {
                count1 += arrayNum[j];
            }

            if (count == count1) {
                return i + 1;
            }
        }
        return -1;
    }

}
