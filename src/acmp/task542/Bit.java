package acmp.task542;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Bit {
    public static void main(String[] args) throws IOException {
        int m  = AdylUtils.readInt();
        int radix = 2;

        int result = bitReverse(m,radix);
        System.out.println(result);
    }

    private static int bitReverse(int m, int radix) {
        String  b = Integer.toString(m,radix);
        char[] numberChars = b.toCharArray();

        StringBuilder s = new StringBuilder();
        for (int i = numberChars.length -1; i >= 0; i--){
            s.append(numberChars[i]);
        }
        return Integer.parseInt(s.toString(), radix);
    }
}
