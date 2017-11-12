package exams.exam21208;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 12.08.2017.
 */
public class FindRounding {
    public static void main(String[] args) throws IOException {
        double E = 2.7182818284590452353602875;
        double zeros = 1.0;
        int y = AdylUtils.readInt();
        for( int i = 0; i < y; i++){
            zeros *=10;
        }

        double multipliedE = E * zeros;
        long multipliedEWithoutDecimal = Math.round(multipliedE);
        double roundedE = multipliedEWithoutDecimal / zeros;

        System.out.println(roundedE);
    }
}
