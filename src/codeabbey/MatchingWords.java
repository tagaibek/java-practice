package codeabbey;

import java.util.*;

public class MatchingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> alibaba = new ArrayList<>();
        for (int i = 0; i < 301 ; i++) {
            String string = sc.next();
            if (Objects.equals(string, "end")){
                break;
            }
            else alibaba.add(string);
        }
        List<String > result = foundWords(alibaba);
        for (String i: result) {
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }

    private static List<String> foundWords(List<String> alibaba) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < alibaba.size(); i++) {
            String s = alibaba.get(i);
            int count = 0;
            for (String word: alibaba) {
                if (Objects.equals(word, s)){
                    count++;
                }
            }

            /*
            String is always singleton, there are no 2 instances of the same string in the memory.
            Therefore it is safe to use result.contains(s) here.
             */
            if (count > 1 && !result.contains(s)){
                result.add(s);
            }
        }

        Collections.sort(result); // you can just sort the original list
        return result;
    }
}
