package home_tasks;

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char[] parameters = string.toCharArray();

        int result  = hexValue(parameters);
        System.out.println(result);
    }

    private static int hexValue(char[] parameters) {
        int result = 0;
        for (char parameter : parameters) {
            switch (parameter) {
                case 'a': result = 10;break;
                case 'b': result = 11;break;
                case 'c': result = 12;break;
                case 'e': result = 13;break;
                case 'f': result = 14; break;
                case 'g': result = 15;break;
                default: result = -1; break;
            }
        }
        return result;
    }
}
