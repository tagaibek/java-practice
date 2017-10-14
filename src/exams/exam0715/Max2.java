package exams.exam0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Human on 15.07.2017.
 */
public class Max2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String positive =reader.readLine();
        String[] s =  positive.split(" ");
        int[] arsNum = new int[s.length];
        for (int i = 0; i<s.length;i++){
            arsNum[i] = Integer.parseInt(s[i]);
        }
        findSecondLargest(arsNum);
        int m  = findSecondLargest(arsNum);
        System.out.println(m);

    }

    public static int findSecondLargest(int[] numbers){
            int maxNumber = 0;
            int maxNumber2 = 0;
            if (numbers.length==0 || numbers.length<=1){
                return -1;
            }

            for (int i = 0; i<numbers.length; i++){
                if (numbers[i]<0){
                    return -1;
                }
                if (numbers[i]>maxNumber) {
                    maxNumber = numbers[i];
                }
            }
            for (int j = 0;j<numbers.length;j++){
                    if (numbers[j]>maxNumber2 && numbers[j]<maxNumber){
                        maxNumber2=numbers[j];
                    }
                }

            return maxNumber2;
    }
}
