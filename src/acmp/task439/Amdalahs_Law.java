package acmp.task439;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Amdalahs_Law {
    public static void main(String[] args) throws IOException {
        double n = AdylUtils.readInt();
        int p = AdylUtils.readInt();
        int p2 = 100 - p;
        double tn = p + p2 / n;
        double u = 100 / tn;
        System.out.println(u);
    }
}