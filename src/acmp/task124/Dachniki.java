package acmp.task124;

import java.util.Scanner;

public class Dachniki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++){
            double x = sc.nextInt();
            double y = sc.nextInt();

            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();

            double x3 = sc.nextInt();
            double y3 = sc.nextInt();
            double x4 = sc.nextInt();
            double y4 = sc.nextInt();

            double distance1 = getDistance(x,y,x1,y1,x2,y2);
            double distance3 = getDistance(x,y,x4,y4,x3,y3);
            double distance2 = getDistance(x,y,x1,y1,x4,y4);
            double distance4 = getDistance(x,y,x2,y2,x3,y3);

            int count = 0;
            if (distance1 >= 0 && distance3 <= 0 || distance1 <=0 && distance3 >=0){
                count ++;
            }
            if (distance2 >= 0 && distance4 <= 0 || distance2 <=0 && distance4 >=0){
                count ++;
            }
            if (count == 2){
                result ++;
            }
        }


        System.out.println(result);
        
    }
//


    public static double getDistance(double x, double y, double x1, double y1, double x2, double y2) {
        double a = y1 - y2;
        double b = x2 - x1;
        double c = x1 * y2 - x2 * y1;

        double distance = a * x + b * y + c;

        return distance;
    }
}
