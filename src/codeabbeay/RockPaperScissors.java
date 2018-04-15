package codeabbeay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int rounds = Integer.parseInt(sc.nextLine());
        List<String[]> strList = new ArrayList<>();
        for (int i = 0; i < rounds; i++) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            strList.add(strings);
        }
        int[] winner = getWinner(strList);
        for (int i : winner) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static int[] getWinner(List<String[]> strList) {
        int[] result = new int[strList.size()];
        for (int i = 0; i < strList.size(); i++) {
            String[] strMas = strList.get(i);
            int count = getCount(strMas);
            result[i] = count;
        }
        return result;
    }

    private static int getCount(String[] strMas) {
        int count1 = 0;
        int count2 = 0;
        for (String strMa : strMas) {
            char[] chars = strMa.toCharArray();

            if (chars[0] == 'R' && chars[1] == 'S' || chars[0] == 'P' && chars[1] == 'R' ||
                chars[0] == 'S' && chars[1] == 'P') {
                count1++;
            } else if (chars[0] == 'S' && chars[1] == 'R' || chars[0] == 'R' && chars[1] == 'P' ||
                chars[0] == 'P' && chars[1] == 'S') {
                count2++;
            }
        }

        return (count1 > count2) ? 1 : 2;
    }
}
