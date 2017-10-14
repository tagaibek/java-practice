package practice.june01;

import java.util.ArrayList;

/**
 * Created by Student on 01.06.2017.
 */
public class Fount {
    public static void main(String[] args) {
        int[] integers = {1,5,9};

        Fount fount = new Fount();
        int orro=fount.sred(integers);
        System.out.println(orro);

    }
    public int sred(int[] inter){
        int srednee =0;
        int max = 0;
        int min = 100;
        for (int i:inter){
            if (i>max){
                max=i;
            }
            for (int j:inter){
                if (j<min){
                    min = j;
                }
                for (int k :inter){
                    if (k<max && k>min){
                        srednee = k;
                    }
                }
            }
        }
       return srednee;

    }
}
