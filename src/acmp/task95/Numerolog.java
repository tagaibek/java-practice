package acmp.task95;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Numerolog {
    public static void main(String[] args) throws IOException {
        int num = AdylUtils.readInt();
        int k = 0;
        int num2 = 0;
        while (num > 9){
            num2 = num;
            num = 0;
        }
        while (num2 > 9){
            num2 = num2 / 10;
            num += num2;
            k +=1;
        }
        System.out.println(num +" " + k);

    }
}