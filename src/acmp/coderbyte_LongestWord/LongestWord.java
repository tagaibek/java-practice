package acmp.coderbyte_LongestWord;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        String string = AdylUtils.readString();
        char[] sen = string.toLowerCase().toCharArray();
        String s = "";
        for (char i : sen) {
            s += (i >= 97 && i <= 122) ? i : ' ';
        }
        String[] stringChar = s.split(" ");
        String result = longestWord(stringChar);
        System.out.println(result);

    }

    private static String longestWord(String[] stringChar) {
        String string = "";
        for (String i : stringChar) {
            if (i.length() > string.length()) {
                string = i;
            }
        }
        return string;
    }
}
