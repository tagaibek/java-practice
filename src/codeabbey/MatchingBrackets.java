package codeabbey;

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
    }

    private static int sequence(char[] chars) {
        int num = 0;
        boolean  b = countOfSequence(chars);
        if (b){
            num = isBracket(chars);
        }
        return num;
    }

    private static int isBracket(char[] chars) {
        String value = "";
        for (char i : chars) {
            if (i == 40 || i == 41 || i == 60 || i == 62
                    || i == 91 ||  i == 93 || i == 123 || i == 125 ){
                value += i;
            }
        }
        char[] seq = value.toCharArray();
        return 0;
    }

    private static boolean countOfSequence(char[] chars) {
        int count = 0;
        for (char i : chars) {
            if (i == 40 || i == 41 || i == 60 || i == 62
                    || i == 91 ||  i == 93 || i == 123 || i == 125 ){
                count++;
            }
        }
        if (count % 2 == 0){
            return true;
        }
        return false;
    }
}
