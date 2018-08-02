package home_tasks;

import java.util.Scanner;

public class MultiplyTwoBinary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary1 = sc.nextInt();
        int binary2 = sc.nextInt();

        int result = multiplyBinaries(binary1, binary2);
        System.out.println(result);
    }

    private static int multiplyBinaries(int binary1, int binary2) {
        int decimal1 = convertToDecimal(binary1);
        int decimal2 = convertToDecimal(binary2);

        int resultDecimal = decimal1 * decimal2;

        int resultBinary = convertToBinary(resultDecimal);
        return resultBinary;
    }

    private static int convertToBinary(int resultDecimal) {
        String temp = "";
        int b;

        while (resultDecimal != 0) {
            b = resultDecimal % 2;
            temp = b + temp;
            resultDecimal = resultDecimal / 2;
        }
        return Integer.parseInt(temp);
    }

    private static int convertToDecimal(int binary) {

        int res = 0, a, mult = 0;
        char[] symbols = String.valueOf(binary).toCharArray();

        for (int len = symbols.length - 1; len >= 0; len--) {
            int temp;
            a = Character.getNumericValue(symbols[len]);
            temp = a * pow(mult);
            mult++;
            res += temp;
        }

        return res;
    }

    public static int pow(int mult) {
        int result = 1;
        for (int i = 0; i < mult; i++) {
            result *= 2;
        }
        return result;
    }


}
