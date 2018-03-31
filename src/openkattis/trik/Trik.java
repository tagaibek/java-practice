package openkattis.trik;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int result = getPlace(string);
        System.out.println(result);
    }

    private static int getPlace(String string) {
        char[] chars = string.toCharArray();
        int[] positions = new int[]{1, 0, 0};

        for (char aChar : chars) {
            if ('A' == aChar) {
                substitute(positions, 0, 1);
            }
            if ('B' == aChar) {
                substitute(positions, 1, 2);
            }
            if ('C' == aChar) {
                substitute(positions, 0, 2);
            }
        }

        int result = 0;
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] == 1){
                result = i + 1;
                break;
            }
        }
        return result;
    }

    private static void substitute(int[] positions, int p_1, int p_2) {
        int v_1 = positions[p_1];
        positions[p_1] = positions[p_2];
        positions[p_2] = v_1;
    }
}
