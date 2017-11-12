package exams.exam0807;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 11.08.2017.
 */
public class Edinica {
    public static void main(String[] args) throws IOException {
        int index = AdylUtils.readInt();
        int value = findValue(index);

        System.out.println(value);
    }

    private static int findValue(int index) {
        int a = 0;
        while (index > 0) {
            a += index % 2;
            index /= 2;
        }

        return a;
    }
}
