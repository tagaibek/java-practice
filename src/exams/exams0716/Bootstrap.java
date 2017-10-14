package exams.exams0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Human on 16.07.2017.
 */
public class Bootstrap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] num = str.split(" ");
        int[] numbers = new int[num.length];
        for (int i = 0; i<num.length;i++){
            numbers[i]= Integer.parseInt( num[i]);
        }

        int[] s =sortNumbers(numbers);
        System.out.println(Arrays.toString(s));
    }

    private static int[] sortNumbers(int[] numbers) {
        if(numbers.length < 2){
            return numbers;
        }

        int[] sortNumbers1 = new int[numbers.length];

        for (int index1 = 0; index1 < numbers.length; index1++){
            int minNum=100;
            int minIndex = 0;

            for (int index2 = 0; index2<numbers.length;index2++){
                if (numbers[index2]<minNum) {
                    minNum = numbers[index2];
                    minIndex  = index2;
                }
            }
            sortNumbers1[index1]=minNum;
            numbers[minIndex]=100000;
        }
        return sortNumbers1;
    }
}
