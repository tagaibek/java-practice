package acmp.coderbyteSymbols;

import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(SimpleSymbols(s.nextLine()));

    }

    private static String SimpleSymbols(String s) {
        char[] ask = (s + "").toCharArray();
        for (int i = 0; i < ask.length; i++) {
            if (ask[i] >= 97 && ask[i] <= 122) {
                if (i == 0 || i + 1 == ask.length || ask[i + 1] != 43 || ask[i - 1] != 43) {
                    return "false";
                }
            }
        }

            return "true";
    }
}
