package codeabbey;

import java.util.Scanner;

public class ArrayCheckSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int i = 0;
        int[] exampleArray = new int[length];
        while (  i < length){
            exampleArray[i] = sc.nextInt();
            i++;
        }
        checkSum(exampleArray);

    }

    private static int checkSum(int[] exampleArray) {
        int result = 0;
        int seed = 113;
        int limit = 10000007;
        for (int i = 0; i < exampleArray.length; i++) {
            result = (result + exampleArray[i]) * seed;
            if (result >= limit ){
                result = result % limit;
            }
        }
        return result;
    }
}
