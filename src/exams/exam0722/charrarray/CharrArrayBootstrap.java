package exams.exam0722.charrarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Human on 22.07.2017.
 */
public class CharrArrayBootstrap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] strArray = s.split(" ");
        char[] chars = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            chars[i] = strArray[i].toCharArray()[0];
        }

        System.out.println("enter start position:");
        //@todo read from console
        String s1 = reader.readLine();
        int startPosition = Integer.parseInt(s1);

        System.out.println("enter the length:");
        String s2 = reader.readLine();
        int length = Integer.parseInt(s2);

        if (chars.length <= startPosition + length) {
            System.out.println("-1");
        } else {
            char[] c = createNewCharrArray(chars, startPosition, length);
            System.out.println(Arrays.toString(c));
        }
    }

    private static char[] createNewCharrArray(char[] chars, int startPosition, int length) throws IOException {
        char[] newChar = new char[length];
        int i = 0;
        for (int index = 0; index < chars.length; index++) {
            if (index >= startPosition && i < length) {
                newChar[i++] = chars[index];
            }
        }

        return newChar;
    }
}
