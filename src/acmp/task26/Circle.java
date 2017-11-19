package acmp.task26;

import acmp.utils.AdylUtils;

import java.io.IOException;


public class Circle {
    public static void main(String[] args) throws IOException {
        int[] arr1 = AdylUtils.readIntArray();
        int[] arr2 = AdylUtils.readIntArray();
        String result = findIntersection(arr1, arr2);
        System.out.println(result);
    }

    private static String findIntersection(int[] arr1, int[] arr2) {
        int x1 =arr1[0];
        int y1 = arr1[1];
        int r1 = arr1[2];

        int x2 = arr2[0];
        int y2 = arr2[1];
        int r2 = arr2[2];


        int r = r2 + r1;
        int a = (x2-x1)*(x2 - x1)+(y2-y1) * (y2 - y1);
        double b = Math.sqrt(a);
        //int i = isArtificial ? 1: 2;
       return b <=r ? "Yes" : "No";
    }
}
