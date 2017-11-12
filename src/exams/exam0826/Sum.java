package exams.exam0826;

import acmp.utils.AdylUtils;

import java.io.IOException;

/**
 * Created by Human on 26.08.2017.
 */
public class Sum {
    public static void main(String[] args) throws IOException {
        int[] numberArr = AdylUtils.readMembersAsIntArray();
        String find = findSum(numberArr);
        System.out.println(find);
    }

    private static String findSum(int[] number) {
        String yes = "yes";
        String no = "no";
        int index2= 0;
        int index3=0;
        for (int i = 0; i < 3;i++){
            index2+=number[i];}
        for (int i = 3; i<number.length;i++){
                index3+=number[i];
            }
        if (index2==index3){
            return yes;
        }
        else return no;
    }
}
