package openkattis.pizza2;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();
        double r = sc.nextInt();
        double result = getPercent(c,r);
        System.out.println(result);
    }

    private static double getPercent(double c, double r) {
        if (c == r ){
            return 0.0;
        }
        else {
        double areaC = Math.PI * (c * c);
        double areaR = Math.PI * (r * r);
        double pr = (areaR /areaC ) * 100;
        return pr;
        }
    }
}
