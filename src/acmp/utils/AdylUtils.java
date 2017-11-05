package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Human on 12.08.2017.
 */
public class AdylUtils {
    public static String readString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    /**
     * Reads numbers separated by space as an array of integers.
     * Читает массив цифр разделенные пробелом.
     * example: 1 2 3 45 ==> [1, 2, 3, 45]
     * @return int[] array of integers
     * @throws IOException
     */
    public static int[] readIntArray() throws IOException {
        String string = AdylUtils.readString();
        String[] s = string.split(" ");
        int[] arsNum = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arsNum[i] = Integer.parseInt(s[i]);
        }

        return arsNum;
    }
    public static int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    /**
     * Reads members of a single number as an array of integers.
     * Читает участников одной цифры как массив цифр.
     * example: 12345 ==> [1, 2, 3, 4, 5]
     * @return int[] array of integers
     * @throws IOException
     */
    public static int[] readMembersAsIntArray() throws IOException {
        int number = AdylUtils.readInt();

        return  splitNumberAsIntArray(number);

    }

    public static int[] splitNumberAsIntArray(int number){

        char[] numberChars = (number +"").toCharArray();
        int[] numberArr = new int[numberChars.length];

        for(int i = 0; i < numberChars.length; i++){
            numberArr[i] = Integer.valueOf(numberChars[i] +"");

        }
        return numberArr;

    }
}
