package home_tasks;

import java.util.Scanner;


public class Investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountInvest = sc.nextInt();
        double rateOfInterest = sc.nextInt();
        int years = sc.nextInt();


        double result = futureValue(amountInvest,rateOfInterest,years);
        result = Math.round(result * 100.0) / 100.0;
        System.out.println(result);
    }

    private static double futureValue(int amountInvest, double rateOfInterest, int years) {
        int mon;
        double sumYear = 0;
        for (int i = 1; i < 13 ; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12){
                mon = 31;
            }
            else if (i == 2){
                mon = 28;
            }
            else mon = 30;
            sumYear += (amountInvest * rateOfInterest * mon / 365) / 100;
        }
        sumYear = sumYear * years + amountInvest;
        return sumYear ;
    }
}
