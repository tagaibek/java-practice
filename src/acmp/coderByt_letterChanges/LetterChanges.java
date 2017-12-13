package acmp.coderByt_letterChanges;

import java.util.Arrays;
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
        int j = 0;
        for (char i : chars) {
            if (i >= 97 && i <= 122) {
                chars1[j] = (char) (i + 1);
                j++;
            } else{
                chars1[j] = i ;
                j++;
            }
        }
        char[] charsV = new char[chars1.length];
        int k = 0;
        for (char i : chars1){
            if (i == 97 || i == 101 || i == 105 || i == 111 || i == 117 || i == 121) {
                char s = (char) (i - 32);
                charsV[k] = s;
                k++;
            }
            else {
                charsV[k] = i;
                k++;
            }
        }
        String string = new String(charsV);
        return string;
    }
}
