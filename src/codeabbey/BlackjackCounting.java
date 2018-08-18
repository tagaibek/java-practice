package codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class BlackjackCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        String[] result = new String[tests];

        for (int i = 0; i < tests; i++) {
            String string = sc.nextLine();
            while (string.isEmpty()) {
                string = sc.nextLine();
            }
            String replaceAll = string.replaceAll("\\s", "");
            char[] numberChars = replaceAll.toCharArray();
            result[i] = counter(numberChars);
        }

        System.out.println(Arrays.toString(result));
    }

    private static String counter(char[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            // T, J, Q, K
            if (s[i] == 'K' || s[i] == 'T' || s[i] == 'Q' || s[i] == 'J') {
                count += 10;
            } else if (s[i] == 50 || s[i] == 51 || s[i] == 52 || s[i] == 53 || s[i] == 54 ||
                    s[i] == 55 || s[i] == 56 || s[i] == 57 || s[i] == 50 + 48) {
                count += Integer.parseInt(String.valueOf(s[i]));
            } else if (s[i] == 'A') {
                count += (count + 11 > 21)? 1 : 11;
            }

            if (count > 21) {
                return "Bust";
            }
        }
        return String.valueOf(count);
    }
}
