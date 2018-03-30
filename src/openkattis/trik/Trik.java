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
        int[] number = new int[3];
        number[0] = 1;
        for (int i = 0; i < chars.length; i++){
            if ('A' == chars[i] ){
                int a = number[0];
                int b = number[1];
                number[1] = a;
                number[0] = b;
            }
            if ('B' ==chars[i]){
                int b = number[1];
                int c = number[2];
                number[2] = b;
                number[1] = c;
            }
            if ('C' ==chars[i]){
                int a = number[0];
                int c = number[2];
                number[2] = a;
                number[0] = c;
            }
        }
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 1){
                result = i + 1;
                break;
            }

        }
        return result;
    }
}
