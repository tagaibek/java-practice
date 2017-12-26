package acmp.codebyteQuestionMarks;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(QuestionMarks(s.nextLine()));
    }

    private static String QuestionMarks2(String s) {
        int counter = 0;
        int number = 0;
        boolean found = false;
        for (char c : s.toCharArray()) {
            if (c > 48 && c < 58) {
                if (number == 0) {
                    number = Character.getNumericValue(c);
                } else {
                    int currentNumber = Character.getNumericValue(c);
                    if (number + currentNumber == 10) {
                        if(counter == 3){
                            found = true;
                        } else {
                            return "false";
                        }
                    }

                    number = currentNumber;
                    counter = 0;
                }
            } else if(number != 0 && c == 63){
                counter ++;
            }
        }

        return found ? "true":"false";
    }

    private static String QuestionMarks(String s) {
        char[] str = s.toCharArray();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 49 && str[i] <= 57) {
                indexes.add(i);
            }
        }
        int counter = 0;
        int count = 0;
        int into = 0;
        for (int i = 0; i < indexes.size() - 1; i++) {
            int j = i + 1;
            if (Integer.parseInt(String.valueOf(str[indexes.get(i)])) + Integer.parseInt(String.valueOf(str[indexes.get(j)])) == 10) {
                into++;
                for (int l = indexes.get(i); l < indexes.get(j); l++) {
                    if (str[l] == 63) {
                        counter++;
                    }
                }
                if (counter >= 3) {
                    count += counter;
                    counter = 0;
                } else counter = 0;
            }
        }
        if (into > 1) {
            if (count / into == 3) {
                return "true";
            } else return "false";
        } else if (into == 1 && count == 3) {
            return "true";
        } else return "false";

    }
}
