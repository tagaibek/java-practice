package acmp.task271;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        int enterNum = AdylUtils.readInt();
        int indexNumber = 0;
        int f0 = 0;
        int f1 = 1;
        int f3 = 0;

        while (f3 <= enterNum) {
            f3 = f0 + f1;
            f0 = f1;
            f1 = f3;
            indexNumber++;
        }
        if (f0 == enterNum) {
            System.out.println(1);
            System.out.println(indexNumber);
        } else System.out.println(0);
    }
}
