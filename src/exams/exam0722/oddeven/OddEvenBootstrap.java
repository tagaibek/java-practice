package exams.exam0722.oddeven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Human on 22.07.2017.
 */
public class OddEvenBootstrap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strings = reader.readLine();
        String[] s = strings.split(" ");
        int[] ints = new int[s.length];
        for (int i = 0;i<s.length;i++){
            ints[i]=Integer.parseInt(s[i]);
        }
       int m = findOddEvenSumDiff(ints);
        System.out.println(m);
    }

    private static int findOddEvenSumDiff(int[] ints) {
        int diff = 0;
        for (int i = 0; i<ints.length; i++){
            if (ints[i]%2==0 ){
                diff -= ints[i];
            } else {
                diff += ints[i];
            }
        }
        return diff;
    }

}
