package exams.exam1208;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 12.08.2017.
 */
public class Reshka {
    public static void main(String[] args) throws IOException {
        int centCount = AdylUtils.readInt();
        int[] cent =new int[centCount];
        for (int i = 0; i<cent.length; i++){
            cent[i]=AdylUtils.readInt();
        }
        int x = findMiniCent(cent);
        System.out.println(x);
    }

    private static int findMiniCent(int[] cent) {
        int reshka=0;
        int rebro = 0;

        for (int i = 0; i<cent.length;i++){
            if (cent[i]==1){
                reshka++;
            }
            else {
                rebro++;
            }
        }

        return rebro<reshka ? rebro: reshka;
    }
}
