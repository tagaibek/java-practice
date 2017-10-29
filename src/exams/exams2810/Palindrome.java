package exams.exams2810;

import utils.AdylUtils;

import java.io.IOException;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        String palin = AdylUtils.readString();
        System.out.println(testPalin(palin));
    }

    private static String testPalin(String palin) {
        if (palin.length()<4 | palin.length()>4){
            return "error";
        }
        String firstStr = palin.substring(0,2);
        String secondStr = palin.substring(2);

        String s = secondStr.substring(1);
        String s1 = secondStr.substring(0,1);
        secondStr = s + s1;

        int firstNum = Integer.parseInt(firstStr);
        int secondNum = Integer.parseInt(secondStr);
        if (firstNum==secondNum){
            return "yes";
        } else return "no";
    }
}
