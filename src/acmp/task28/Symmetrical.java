package acmp.task28;

import java.util.Scanner;

public class Symmetrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int xA = sc.nextInt();
        int yA = sc.nextInt();

        // 1)
        double a = y1 - y2;
        double b = x2 - x1;
        double c = x1 * y2 - x2 * y1;
        //2)
        double x3 = (b * (b * xA - a * yA )  - a * c) / (a * a + b * b) ;
        double y3 = (a * (-b *xA + a * yA) -b * c) / (a * a + b * b);
        //3)
        double x = 2 * x3 - xA;
        double y = 2 * y3 - xA;
        System.out.println(x + " " +y);
    }
}
