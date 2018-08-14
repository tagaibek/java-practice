package home_tasks;

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char[] parameters = string.toCharArray();

        int hexNum[] = hexValue(parameters);
        if (hexNum.length == 0) {
            System.out.println(-1);
        }
        else convertTo10Base(hexNum);
    }

    private static void convertTo10Base(int[] hexNum) {
        int result = 0;
        for (int i = 0; i <hexNum.length ; i++) {
            result += hexNum[i] *  Math.pow(16, hexNum.length - 1 - i);
        }
        System.out.println(result);
    }

    private static int[] hexValue(char[] parameters) {
        int indexChar;
        int[] arrayInts = new int[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            switch (Character.toLowerCase(parameters[i])) {
                case '0':
                    indexChar = 0;
                    break;
                case '1':
                    indexChar = 1;
                    break;
                case '2':
                    indexChar = 2;
                    break;
                case '3':
                    indexChar = 3;
                    break;
                case '4':
                    indexChar = 4;
                    break;
                case '5':
                    indexChar = 5;
                    break;
                case '6':
                    indexChar = 6;
                    break;
                case '7':
                    indexChar = 7;
                    break;
                case '8':
                    indexChar = 8;
                    break;
                case '9':
                    indexChar = 9;
                    break;
                case 'a':
                    indexChar = 10;
                    break;
                case 'b':
                    indexChar = 11;
                    break;
                case 'c':
                    indexChar = 12;
                    break;
                case 'd':
                    indexChar = 13;
                    break;
                case 'e':
                    indexChar = 14;
                    break;
                case 'f':
                    indexChar = 15;
                    break;
                default:
                    indexChar = -1;
                    break;
            }

            if (indexChar == -1) {
                return new int[0];
            } else arrayInts[i] = indexChar;
    }


        return arrayInts;
}
}
