package codeabbey;

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
            String s = removeChar(string);
            s.replace(" ","");
            char[] charI = s.toCharArray();



            for (int j = 0; j < charI.length; j++) {
                String indexStr = "";
                String indexStr1 = "";
                for (int m = 0; m < charI.length; m++) {
                    indexStr += charI[m];
                }
                for (int l = charI.length - 1; l >= 0; l--) {
                    indexStr1 += charI[l];
                }
                if (Objects.equals(indexStr, indexStr1)) {
                    result[i] = "Y";
                } else result[i] = "N";
            }

        }
        return result;
    }

    private static String removeChar(String string) {
        String s = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            s += (chars[i] > 31 && chars[i] < 48) ? "" : chars[i];
        }
        return s;
    }
}
