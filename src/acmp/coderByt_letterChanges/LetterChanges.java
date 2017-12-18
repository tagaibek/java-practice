package acmp.coderByt_letterChanges;

import java.util.Scanner;

public class LetterChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] chars = string.toCharArray();
        String result = changes(chars);
        System.out.println(result);

    }

    private static String changes(char[] chars) {
        char[] chars1 = new char[chars.length];
        int i = 0;
        for (char c : chars) {
            chars1[i++] =(c >= 97 && c <= 121 )? (char) (c + 1) : (c == 122) ? 97 : c;
        }
        char[] charsV = new char[chars1.length];
        int k = 0;
        for (char c : chars1){
            charsV[k++] = (c == 97 || c == 101 || c == 105 || c == 111 || c == 117 || c == 121) ? (char) (c - 32) : c;
        }

        return new String(charsV);
    }
}
