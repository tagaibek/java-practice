package codeabbeay.count.words;

import java.util.*;

public class Words {
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
            if (count > 1){
                result.add(s);
            }
        }
        return sortList(result);
    }

    private static List<String> sortList(List<String> result) {
        Set<String> s = new HashSet<>(result);
        List<String> res = new LinkedList<>(s);
        Collections.sort(res);
        return res;
    }
}
