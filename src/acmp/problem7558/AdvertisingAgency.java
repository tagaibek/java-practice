package acmp.problem7558;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class AdvertisingAgency {
    public static void main(String[] args) throws IOException {
        boolean[] billboards = new boolean[100];
        int result = numberOfRejections(billboards);
        System.out.println(result);
    }

    private static int numberOfRejections(boolean[] billboards) throws IOException {
        int k = 0;
        int[] requests = AdylUtils.readIntArray();
        for (int i : requests) {
            if (!billboards[i - 1]) {
                billboards[i-1] = true;
            } else k++;
        }
        return k;
    }
}
