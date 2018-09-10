package homeTasks2;

import java.util.Scanner;

public class ArrayChecksum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] testArray = new int[length];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = sc.nextInt();
        }
        System.out.println(checkSum(testArray));
    }

    private static int checkSum(int[] testArray) {
        int result = 0;
        for (int indexNum : testArray) {
            result = (result + indexNum) * 113;
            if (result >= 10000007) {
                result = result % 10000007;
            }
        }
        return result;
    }
}
