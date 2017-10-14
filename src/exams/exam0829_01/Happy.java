package exams.exam0829_01;

import utils.AdylUtils;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Human on 01.09.2017.
 */
public class Happy {
    public static void main(String[] args) throws IOException {
        int k = AdylUtils.readInt();
        for (int i = 0; i<k; i++){
            //199 999: 200 000, 199 998
            int n = AdylUtils.readInt();
            int nPlus = n+1;
            int nMinus = n-1;

            if(isLuckyNumber(nPlus)){
                System.out.println("yes");
            } else if(isLuckyNumber(nMinus)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }


    private static boolean isLuckyNumber(int number){
        // number =  200 000
        int[] indexNumber = AdylUtils.splitNumberAsIntArray(number);
        int sum3 = 0;
        int sum6 = 0;
        int counter = 0;


        //00 2 100 -> 2 1 0 1
        for (int i =indexNumber.length-1; i>=0; i--){
            if (++counter<=3){
               sum6+=indexNumber[i];
            }
            else {
                sum3+=indexNumber[i];
            }
        }

        if (sum3==sum6){
            return true;
        }
        else
            return false;
    }
}
