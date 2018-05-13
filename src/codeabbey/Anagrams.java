package codeabbey;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        HashSet<String> words = new HashSet<>();
        try (InputStream is = new URL("http://www.codeabbey.com/data/words.txt").openStream();
             Scanner sc = new Scanner(is, StandardCharsets.UTF_8.toString())) {
            while (sc.hasNextLine())
                words.add(sc.nextLine().trim());
        }

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String[] anagrams = new String[l];
        for (int i = 0; i < l; i++) {
            String word;
            do {
                word = sc.nextLine().trim();
            }
            while (word.isEmpty());

            anagrams[i] = findAnagrams(word, words);
        }

        System.out.println("answer:");
        for (String i : anagrams) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    private static String findAnagrams(String word, HashSet<String> words) {
        StringBuilder res = new StringBuilder();
        for (String str : words) {
            //word= eat
            //words = [boot, ate, tea]
            if (isAnagram(word, str)) {
                res.append(str).append(" ");
            }
        }
        return res.toString();
    }

    private static boolean isAnagram(String word, String str) {
        if (word.length() != str.length() || word.equals(str)) {
            return false;
        }

        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : word.toCharArray()) {
            for (int j = 0; j < chars.length; j++) {
                if (c == chars[j]) {
                    chars[j] = 0;
                    count++;
                    break;
                }
            }
        }

        return count == chars.length;
    }
}
