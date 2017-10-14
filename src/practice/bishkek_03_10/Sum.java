package practice.bishkek_03_10;

import utils.AdylUtils;

import java.io.IOException;

public class Sum {
    public static void main(String[] args) throws IOException {
        int a = AdylUtils.readInt();
        int b = 0;
        for (int i = 1; i <=a; i ++){
            b=b+i;
        }

        System.out.println(b);
    }
}
