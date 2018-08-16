package codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] result = new int[test];
        for (int i = 0; i < test; i++) {
            String string = sc.nextLine();
            while (string.isEmpty()) {
                string = sc.nextLine();
            }
            char[] chars = string.toCharArray();
            result[i] = sequence(chars);
        }
        System.out.println(Arrays.toString(result));
    }

    private static int sequence(char[] chars) {
        int num = isBracket(chars);
        return num;
    }

    private static int isBracket(char[] chars) {
        StringBuilder value = new StringBuilder();
        for (char i : chars) {
            if (i == 40 || i == 41 || i == 60 || i == 62
                    || i == 91 || i == 93 || i == 123 || i == 125) {
                value.append(i);
            }
        }
        char[] seq = value.toString().toCharArray();
        int index = 0;
        int count1 = 0;
        int count2 = 0;
        int result = 0;
        if (seq.length % 2 == 0) {
            for (int i = 0; i < seq.length; i++) {
                int c = seq[i];
                char founder;
                if (c == 40) {
                    founder = 41;
                } else {
                    founder = (char) (c + 2);
                }
                for (int j = i + 1; j < seq.length ; j++) {
                    if (seq[j] == founder){

                    }
                }
            }
        }
    return 0;
    }
}

