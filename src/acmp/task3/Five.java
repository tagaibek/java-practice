package acmp.task3;

import utils.AdylUtils;

import java.io.IOException;

public class Five {
    public static void main(String[] args) throws IOException {
        int[] intArray = AdylUtils.readMembersAsIntArray();
        int lastIndex = intArray.length-1;
        if (intArray[lastIndex]==5){
            System.out.println(getSquare(intArray));
        }
        else System.out.println("The number does not end in 5!!!");
    }

    private static String getSquare(int[] ints) {
        if (ints.length == 1){
            return Integer.toString(5 * 5);
        }

        StringBuilder number = new StringBuilder();
        for (int i  = 0; i < ints.length-1; i++){
            number.append(ints[i]);
        }
        int numberSecond =Integer.parseInt(number.toString());
        int numberFirst = numberSecond+1;
        int square = (numberSecond*numberFirst);

        return square + "25";
    }
}
