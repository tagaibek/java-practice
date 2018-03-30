package codeabbeay.count.palindrom;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        int n = AdylUtils.readInt();
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        String[] result = getResult(strings);
        System.out.println("answer:");
        for (String i : result) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }

    private static String[] getResult(String[] strings) {
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i].toLowerCase();
            char[] charI = string.toCharArray();

            for (int j = 0; j < charI.length; j++) {
                if (charI[j] == ' ') {
                    result[i] = "Y";
                } else {

                    String indexStr = "";
                    String indexStr1 = "";
                    for (int m = 0; m < charI.length; m++) {
                        indexStr += charI[m];
                    }
                    for (int l = charI.length - 1; l >= 0; l--) {
                        indexStr1 += charI[l];
                    }
                    if (Objects.equals(indexStr, indexStr1)) {
                        result[i] = "N";
                    }
                }
            }
        }
        return result;
    }
}
