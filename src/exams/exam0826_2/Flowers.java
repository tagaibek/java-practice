package exams.exam0826_2;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Human on 26.08.2017.
 */
public class Flowers {
    public static void main(String[] args) throws IOException {
        int number = AdylUtils.readInt();
        String[] flowers = {"G","C","V"};
        for (int i = 0; i<number; i++){
            String tmp0 = flowers[0];
            String tmp1 = flowers[1];
            String tmp2 = flowers[2];

            //masha
            flowers[1]=tmp2;
            flowers[2]=tmp1;

            //tanya
            flowers[0]=tmp2;
            flowers[1]=tmp0;

        }
        System.out.println(Arrays.toString(flowers));
    }
}
