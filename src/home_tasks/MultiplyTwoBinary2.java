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

        return convertToBinary(resultDecimal);
    }

    private static int convertToBinary(int resultDecimal) {
        StringBuilder temp = new StringBuilder();

        while (resultDecimal != 0) {
            int b = resultDecimal % 2;
            temp.insert(0, b);
            resultDecimal = resultDecimal / 2;
        }
        return Integer.parseInt(temp.toString());
    }

    private static int convertToDecimal(int binary) {

        int res = 0, mult = 0;
        char[] symbols = String.valueOf(binary).toCharArray();

        for (int len = symbols.length - 1; len >= 0; len--) {
            int a = Character.getNumericValue(symbols[len]);
            res += (int) (a * Math.pow(2, mult));
            mult++;
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
