package acmp.task148;

import acmp.utils.AdylUtils;

import java.io.IOException;


public class Gcd {
    public static void main(String[] args) throws IOException {
        int[] number = AdylUtils.readIntArray();
        System.out.println(getGcd(number));
    }

    private static String getGcd(int[] s) {
        int a = s[0];
        int b = s[1];
        int z = 0;
        int m;

        if (a > b){ m = a;}
        else m = b;
        for (int i = 1; i < m; i++){
            if ((a % i == 0) && (b % i == 0)) {
                z = i;
            }
        }
        return String.valueOf(z);
    }
}
