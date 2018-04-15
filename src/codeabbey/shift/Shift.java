package codeabbey.shift;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[sc.nextInt()];
        int k = sc.nextInt();
        for (int i = 0; i < strings.length; i++) {
            String string = sc.nextLine();
            while (string.isEmpty()) {
                string = sc.nextLine();
            }
            strings[i] = string;
        }
        String[] result = getResult(k, strings);
        for (String i : result) {
            System.out.println(i + "");
        }
    }

    private static String[] getResult(int k, String[] strings) {
        String[] resultStr = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                int tmp = chars[j];

                if (tmp >= 65 && tmp <= 90) {
                    tmp -= k;
                    if (tmp < 65) {
                        tmp += 26;
                    }
                }
                chars[j] = (char) tmp;
            }

            resultStr[i] = new String(chars);
        }
        return resultStr;
    }
}
