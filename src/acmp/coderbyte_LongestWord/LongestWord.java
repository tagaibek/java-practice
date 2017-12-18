package acmp.coderbyte_LongestWord;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        String string = AdylUtils.readString();
        String[] sen = string.split(" ");
        String result = longestWord(sen);
        System.out.println(result);

    }

    private static String longestWord(String[] sen) {
        String string = "";
        for (String i : sen){
            if (i.length() > string.length() ){
                string = i;
            }
        }
        return string;
    }
}
