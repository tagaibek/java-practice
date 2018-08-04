package mum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] chars = line.replace(" ", "").toCharArray();
        int start = sc.nextInt();
        int length = sc.nextInt();

        char[] result = subChars(chars, start, length);
        if (result == null) {
            System.out.println("null");
        } else if (result.length == 0) {
            System.out.println(" empty ");
        } else {
            System.out.println(new String(result));
        }
    }

    private static char[] subChars(char[] chars, int start, int length) {
        List<Character> characterList = new ArrayList<>();
        if (length > chars.length || start == 1 && length == chars.length ||
                start == length && chars.length - 1 == length || length < 0 || start < 0 || start > chars.length - 1 || chars.length == 0) {
            return null;
        }

        if (length == 0) {
            return new char[0];
        }
        if (start > length) {
            for (int i = start; i > length; i--) {
                characterList.add(chars[i]);
            }
        }
        if (start > 0 && start != length) {
            for (int i = start; i <= length; i++) {
                characterList.add(chars[i]);
            }
        } else if (start == length) {
            length = length + 1;
            for (int i = start; i < length; i++) {
                characterList.add(chars[i]);
            }
        }
        char[] result = new char[characterList.size()];
        for (int i = 0; i < characterList.size(); i++) {
            result[i] = characterList.get(i);
        }
        return result;
    }


}
