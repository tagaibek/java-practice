package codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TrickyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> string = new ArrayList<>();
        boolean b = true;
        while (b) {
            String s = sc.next();
            if (Objects.equals(s, ":")) {
                b = false;
            } else {
                string.add(s);
            }
        }
        String s = getResult(string);
        System.out.println(s);
    }

    private static String getResult(List<String> string) {
        int count = 0;
        for (String s : string) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                count++;
            }
        }
        if (count > 10) {
            StringBuilder result = new StringBuilder();
            int in = count / 10;
            int inn = count % 10;
            if (inn > 0){
                int sum = in + inn;
                for (int i = 0; i < sum ; i++) {
                    result.append("+");
                    if (i == in - 1){
                        result.append(" : ");
                    }
                }
                return result + " :";
            }
            else {
                for (int i = 0; i <in ; i++) {
                    result.append("+");
                }
                return result + " :";
            }

        }

        return "0";
    }
}
