package exams.exam0526_3;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 26.08.2017.
 */
public class Guess {
    public static void main(String[] args) throws IOException {
        int number = AdylUtils.readInt();
        int findSumInt = findSumint(number);
        System.out.println(findSumInt);
    }

    private static int findSumint(int number) {
        int sumInt = 0;
        for (int i =1;i<=number; i++){
            if (number%i==0){
                sumInt+=i;
            }
        }
        return sumInt;
    }
}
