package acmp.task317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Santa {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(" ");
        int[] numInts = new int[string.length];
        for (int i = 0; i < string.length; i++){
            numInts[i] = Integer.parseInt(string[i]);
        }
        String result = getSum(numInts);
        System.out.println(result);
    }

    private static String getSum(int[] number) {
        int x = number[0];
        int y = number[1];
        int z = number[2];
        int w = number[3];
        int sum = 0;
        for (int i =0; i <= w; i+=x){
            for (int j = 0; j <= w; j+=y){
                for (int f = 0; f <= w; f+=z){
                    if (i+j+f==w){
                        sum++;
                    }
                }
            }
        }
        return String.valueOf(sum);
    }
}
