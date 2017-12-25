package acmp.codebyteQuestionMarks;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

    private static String QuestionsMarks(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        Scanner scanner;

        for (int i = 0; i < chars.length; i++) {
            if (chars.length >= 10 && chars[i]>=48 && chars[i] <= 57){
                counter++;
            }else {
                return "false";
            }
            if (counter >= 2){
            }
        }
return "";
    }
}
